![[FE2_lab1.pdf]]

## Arquivos
![[lab1.zip]]

## Resposta
```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Calculadora</title>
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link rel="stylesheet" href="./style.css" />
  <script type="module" src="./script.js"></script>
</head>
<body>
  <main class="app">
    <section class="calculator" aria-label="Calculadora">

      <div class="display-wrap">
        <output
          id="display"
          class="display"
          aria-live="polite"
          aria-label="Visor da calculadora (10 posições)"
          data-testid="display"
        ></output>
      </div>

      <div class="keys" aria-label="Teclado da calculadora">
        <button class="key key-func" data-action="clear" aria-label="Limpar" data-testid="key-clear">C</button>
        <button class="key key-func" data-action="backspace" aria-label="Apagar último dígito" data-testid="key-backspace">&#x232B;</button>
        <button class="key key-func" data-action="sign" aria-label="Alternar sinal" data-testid="key-sign">&plusmn;</button>
        <button class="key key-op" data-op="percent" aria-label="Porcentagem" data-testid="key-percent">&percnt;</button>

        <button class="key" data-digit="7" data-testid="key-7">7</button>
        <button class="key" data-digit="8" data-testid="key-8">8</button>
        <button class="key" data-digit="9" data-testid="key-9">9</button>
        <button class="key key-op" data-op="divide" aria-label="Dividir" data-testid="key-divide">&divide;</button>

        <button class="key" data-digit="4" data-testid="key-4">4</button>
        <button class="key" data-digit="5" data-testid="key-5">5</button>
        <button class="key" data-digit="6" data-testid="key-6">6</button>
        <button class="key key-op" data-op="multiply" aria-label="Multiplicar" data-testid="key-multiply">&times;</button>

        <button class="key" data-digit="1" data-testid="key-1">1</button>
        <button class="key" data-digit="2" data-testid="key-2">2</button>
        <button class="key" data-digit="3" data-testid="key-3">3</button>
        <button class="key key-op" data-op="subtract" aria-label="Subtrair" data-testid="key-subtract">&minus;</button>

        <button class="key" data-digit="0" data-testid="key-0">0</button>
        <button class="key" data-digit="." aria-label="Vírgula decimal" data-testid="key-dot">&period;</button>
        <button class="key key-op" data-op="sqrt" aria-label="Raiz quadrada" data-testid="key-sqrt">&Sqrt;</button>
        <button class="key key-op" data-op="add" aria-label="Somar" data-testid="key-add">&plus;</button>

        <button class="key key-op span-2" data-op="power" aria-label="Potenciação" data-testid="key-power">x<sup>y</sup></button>
        <button class="key key-equal span-2" data-action="equals" aria-label="Igual" data-testid="key-equals">&equals;</button>
      </div>
    </section>

    <aside class="history" aria-label="Histórico de operações">
      <header class="history__header">
        <h2>Histórico</h2>
        <button class="history__clear" data-action="history-clear" aria-label="Limpar histórico" data-testid="history-clear">Limpar</button>
      </header>

      <ol id="history-list" class="history__list" reversed data-testid="history-list">
      </ol>
    </aside>
  </main>
</body>
</html>
```


```javascript
const display = document.querySelector("#display");
const teclado = document.querySelector(".keys");
const listaHistorico = document.querySelector(".history__list");
const historico = document.querySelector(".history");

let equacao = "";
let isSqrtAtivo = false;
let ultimoAlgarismo = 0;
limparHistorico();

teclado.addEventListener("click", (e) => {
    // debugger;
    if (e.target.dataset?.digit != null) {
        // display.textContent = e.target.textContent;
        if (verificaDuplicidadePonto(e.target.textContent.trim())) {
            mostraDigitoNoDisplay(e.target.textContent.trim());
            atribuirVariavelEquacao(e.target.textContent.trim());
        }
    }

    switch (e.target.dataset?.action) {
        case "clear":
            limpa();
            break;
        case "backspace":
            backspace();
            break;
        case "equals":
            equals();
            break;
        case "sign":
            ultimoAlgarismo = 0;
            equacao += " *-1 ";
            display.textContent = display.textContent + "\u00D7-1";
            break;
        case "history-clear":
            limparHistorico();
            break;
    }

    if (e.target.dataset?.op != null) {
        atribuirOperacao(e.target.textContent, e);
    }

    if (display.textContent == "") {
        equacao = "";
    }
    // console.log("------------")
    // console.log("equacao: " + equacao)
    // console.log("ultimoAlgarismo: " + ultimoAlgarismo)
    // console.log("isSqrtAtivo: " + isSqrtAtivo)
    // console.log("------------")
    console.log(e.target.dataset?.action);
});

function mostraDigitoNoDisplay(value) {
    display.textContent = display.textContent + value;
}

function substituiNoDisplay(value) {
    if (value == undefined) {
        limpa();
        alert("Expressão inválida");
        return;
    }
    const elementoEquacaoHistorico = document.createElement("li");
    if (equacao.includes("Math.sqrt(")) {
        equacao = equacao.replace("Math.sqrt(", "\u221A");
        equacao = equacao.replace(")", "");
    }
    elementoEquacaoHistorico.textContent = equacao + " = " + value;
    if (listaHistorico.children.length < 10) {
        //
        listaHistorico.append(elementoEquacaoHistorico);
    } else {
        const primeiroElementoHistorico = listaHistorico.firstChild;
        listaHistorico.removeChild(primeiroElementoHistorico);
        listaHistorico.append(elementoEquacaoHistorico);
    }
    limpa();
    display.textContent = value;
    equacao = value;
}

function limpa() {
    // debugger
    display.textContent = null;
    equacao = "";
}

function backspace() {
    display.textContent = display.textContent.slice(0, -1);
    equacao = equacao.slice(0, -1);
}

function equals() {
    // debugger;
    substituiNoDisplay(eval(equacao));
}

function atribuirOperacao(value, e) {
    console.log(value, e);
    ultimoAlgarismo = 0;
    switch (value) {
        case "%":
            equacao += "/ 100 * ";
            break;
        case "÷":
            equacao += " / ";
            break;
        case "×":
            equacao += " * ";
            break;
        case "−":
            equacao += " - ";
            break;
        case "√":
            equacao += " Math.sqrt(";
            isSqrtAtivo = true;
            break;
        case "+":
            equacao += " + ";
            break;
        case "xy":
            equacao += " ** ";
            break;
    }
    display.textContent = display.textContent + value;
}

function atribuirVariavelEquacao(value) {
    equacao += value;
    ultimoAlgarismo += value;

    if (isSqrtAtivo) {
        equacao += ") ";
        isSqrtAtivo = false;
    }
}

function verificaDuplicidadePonto(value) {
    if (value.trim() == ".") {
        if (ultimoAlgarismo.includes(".")) {
            return false;
        }
    }
    return true;
}

historico.addEventListener("click", (e) => {
    // debugger;
    if (e.target.dataset?.action == "history-clear") {
        limparHistorico();
    }
});

function limparHistorico() {
    listaHistorico.textContent = null;
}
```

```css
:root{
  --bg: #0f1216;
  --panel: #161a20;
  --border: #232a33;
  --text: #e9eef5;
  --muted: #9fb0c6;
  --accent: #3a7afe;
  --accent-2: #22b07d;
  --warning: #f0b429;
  --danger: #ef5555;
  --radius: 12px;
  --shadow: 0 8px 24px rgba(0,0,0,.35);
  --mono: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, "Liberation Mono", "Courier New", monospace;
  --sans: system-ui, -apple-system, Segoe UI, Roboto, Ubuntu, "Helvetica Neue", Arial, "Noto Sans", "Liberation Sans", sans-serif;
}

* { box-sizing: border-box; }
html, body { height: 100%; }
body{
  margin: 0;
  background: linear-gradient(180deg, #0b0e12, #121720);
  color: var(--text);
  font-family: var(--sans);
  display: grid;
  place-items: center;
  padding: 24px;
}

.app{
  width: min(960px, 100%);
  display: grid;
  grid-template-columns: 1fr 320px;
  gap: 20px;
}

@media (max-width: 860px){
  .app{ grid-template-columns: 1fr; }
}

.calculator{
  background: var(--panel);
  border: 1px solid var(--border);
  border-radius: var(--radius);
  box-shadow: var(--shadow);
  padding: 16px;
}

.display-wrap{
  background: #0b0f14;
  border: 1px solid var(--border);
  border-radius: 10px;
  padding: 12px 14px;
  margin-bottom: 12px;
}

.display{
  display: block;
  width: 100%;
  text-align: right;
  font-family: var(--mono);
  font-size: clamp(28px, 6vw, 44px);
  letter-spacing: 0.08em;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: clip;
  color: var(--text);
  min-height: 1.4em;
}

.keys{
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 10px;
}

.key{
  appearance: none;
  border: 1px solid var(--border);
  background: #1b212a;
  color: var(--text);
  font-size: 18px;
  padding: 14px 0;
  border-radius: 10px;
  cursor: pointer;
  transition: transform .02s ease, background .2s ease, border-color .2s ease;
  user-select: none;
}

.key:focus-visible{
  outline: 2px solid var(--accent);
  outline-offset: 2px;
}

.key:active{
  transform: translateY(1px);
}

.key:hover{
  background: #222a35;
  border-color: #2b3644;
}

.key-op{
  background: #1a2432;
  border-color: #273244;
}

.key-func{
  background: #231d14;
  border-color: #3b2e1a;
  color: #ffd596;
}

.key-equal{
  background: var(--accent);
  border-color: #2b6df5;
  color: #fff;
  font-weight: 700;
}

.span-2{ grid-column: span 2; }

.history{
  background: var(--panel);
  border: 1px solid var(--border);
  border-radius: var(--radius);
  box-shadow: var(--shadow);
  padding: 16px;
  min-height: 200px;
}

.history__header{
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 10px;
}

.history__header h2{
  margin: 0;
  font-size: 16px;
  color: var(--muted);
  font-weight: 600;
}

.history__clear{
  appearance: none;
  font: inherit;
  padding: 6px 10px;
  border-radius: 8px;
  border: 1px solid #3a2b2b;
  background: #2a1b1b;
  color: #ffb3b3;
  cursor: pointer;
}

.history__clear:hover{
  background: #341f1f;
}

.history__list{
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
  max-height: 360px;
  overflow: auto;
}

.history__item{
  display: grid;
  grid-template-columns: 1fr auto auto;
  gap: 8px;
  align-items: baseline;
  padding: 8px 10px;
  background: #131922;
  border: 1px solid #202838;
  border-radius: 8px;
  cursor: pointer;
}

.history__item:focus-visible{
  outline: 2px solid var(--accent-2);
  outline-offset: 2px;
}

.history__item .expr{
  color: var(--muted);
  font-family: var(--mono);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.history__item .eq{ opacity: .6; }
.history__item .res{
  font-family: var(--mono);
  font-weight: 700;
}
```