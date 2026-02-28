![[FE1 - 18. Objetos JS.pdf]]

## Exercícios

### Lista 03: JavaScript

![[lista-3.zip]]


![[fe1_js_lista_3.pdf]]

#### Correção

```javascript
// Exercicio JSON
// 1 - Pessoa
// a)
let pessoa = {
    nome : "Márcio Bobo",
    idade : 54,
    cidade : "Carapicuíba"     
}

// b)
let saudacoes = `Olá, meu nome é ${pessoa.nome} e tenho ${pessoa.idade} anos`;
console.log(saudacoes);

// c)
pessoa.profissao = {
    cargo : "Açogueiro",
    salario : "13000",
    cargaHorario : 4
}

delete pessoa.cidade;
console.log(pessoa);

// 2 - Livro
// a)
let livro = {
    titulo : "Incrivel mundo de Luana",
    ano : 2025,
    autor : {
        primeiroNome : "Nicolas",
        sobrenome : "Arthur"
    }
}

// b)
console.log(livro.autor["primeiroNome"] + " " + livro.autor["sobrenome"]);

// c)
livro.citacao = function() {
    return `(${livro.autor.sobrenome}, ${livro.ano})`;
}

// d)
console.log(livro.citacao());

// 3 - Animal
// a)
let animal = {
    tipo: "Mamifero",
    falar() {
        return "O animal faz um som.";
    }
}

// b) 
let cachorro = Object.create(animal);

// c)
cachorro.nome = "Choco";
cachorro.falar = function() {
    return `O cachorro ${cachorro.nome} late!!`
}

console.log(animal.falar());
console.log(cachorro.falar());

// 4 - Filme
// a)
let filme = {
    titulo : "Homem de Fero",
    ano : 2010,
    duracao : {
        horas : 2,
        minutos : 6
    },
    generos : ["Ação", "Aventura", "Ficção Científica"],
    diretor : {
            nome : "Jonathan",
            sobrenome : "Kolia Favreau"
    }
}

// b) e c)

function categorizarPropriedades(obj) {
    let strings = [];
    let numeros = [];
    let arrays = [];
    let objetos = [];

    for (let chave in obj) {
        if (typeof obj[chave] === "string") {
            strings.push(chave);
        } else if (typeof obj[chave] === "number") {
            numeros.push(chave);
        } else if (Array.isArray(obj[chave])) {
            arrays.push(chave);
        } else if (typeof obj[chave] === "object" && obj[chave] !== null) {
            objetos.push(chave);
        }
    }

    console.log("Propriedades com valores do tipo string:", strings, `(${strings.length} propriedades)`);
    console.log("Propriedades com valores do tipo número:", numeros, `(${numeros.length} propriedades)`);
    console.log("Propriedades com valores do tipo array:", arrays, `(${arrays.length} propriedades)`);
    console.log("Propriedades com valores do tipo objeto:", objetos, `(${objetos.length} propriedades)`);
}

// d)
console.log("Analisando o objeto 'filme':");
categorizarPropriedades(filme);

//5 - População autista
// a) ./data.json
// b)
fetch('./data.json')
    .then(res => res.json())
    .then(obj => { 
        const resultado = extrairValores(obj); 
        if (resultado) console.log(resultado); 
    });
     
// c)
    function extrairValores(obj) { 
            obj.forEach(item => {
            console.log(`ID: ${item.id}`);
            console.log(`Variável: ${item.variavel}`);
            console.log(`Unidade: ${item.unidade}`);

            item.resultados.forEach(resultado => {
                resultado.classificacoes.forEach(classificacao => {
                    console.log(`Classificação: ${classificacao.nome}`);
                    console.log(`Categoria:`, classificacao.categoria);
                });

                resultado.series.forEach(serie => {
                    console.log(`Localidade: ${serie.localidade.nome}`);
                    console.log(`Ano e percentual:`, serie.serie);
                });
            });
        });
    }

```

### Lista 04: Desafios JavaScript
![[fe1_js_desafio.pdf]]


## Próximo tópico
- [[Manipulando o DOM (Introdução HTML + CSS + JavaScript)]] 

