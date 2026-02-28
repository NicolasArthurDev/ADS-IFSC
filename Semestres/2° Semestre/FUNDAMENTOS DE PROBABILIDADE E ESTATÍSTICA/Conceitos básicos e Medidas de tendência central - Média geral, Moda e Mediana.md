 ![[Cap_1_1.pdf]]

![[Lista_sala_1.pdf]]

---
### Aula 02

![[Cap_1_2.pdf]]

## Como calcular a mediana para dados agrupados

### Passo 1: Calcular a Frequência Acumulada

A frequência acumulada indica quantas observações foram registradas até determinado intervalo.

| **Idade** | **fi (frequência)** | **Fa (frequência acumulada)** |
| --------- | ------------------- | ----------------------------- |
| 10 - 15   | 34                  | 34                            |
| 15 - 20   | 23                  | 34 + 23 = 57                  |
| 20 - 25   | 46                  | 57 + 46 = 103                 |
| 25 - 30   | 100                 | 103 + 100 = 203               |
| 30 - 35   | 39                  | 203 + 39 = 242                |
| 35 - 40   | 8                   | 242 + 8 = 250                 |

O total de observações (**N**) é **250**.

### Passo 2: Determinar a Posição da Mediana

A mediana está na posição:
 $$\frac{N}{2} = \frac{250}{2} = 125$$

Agora, verificamos qual classe contém essa posição na frequência acumulada.

### Passo 3: Identificar a Classe Mediana

A classe mediana é aquela cuja frequência acumulada ultrapassa 125 pela primeira vez. Olhando para a tabela, a primeira classe que ultrapassa esse valor é **25 - 30**, pois a frequência acumulada até a classe anterior (20 - 25) é **103**, e a frequência acumulada até a classe 25 - 30 é **203**.

### Passo 4: Aplicar a Fórmula da Mediana

A fórmula da mediana é:

$$\text{Mediana} = L + \left(\frac{\frac{N}{2} - Fa_ant}{f_med}\right) \times h$$ 

Onde:

- **L** = limite inferior da classe mediana = **25**
- **Fa_ant** = frequência acumulada da classe anterior = **103**
- **f_med** = frequência da classe mediana = **100**
- **h** = amplitude da classe = **5**

Substituindo na fórmula:

$$\text{Mediana} = 25 + \left(\frac{125 - 103}{100}\right) \times 5$$

$$\text{Mediana} = 25 + \left(\frac{22}{100}\right) \times 5$$

$$\text{Mediana} = 25 + 1.1$$

$$\text{Mediana} = 26.1$$

**Conclusão:** A mediana da distribuição é **26.1**.


![[Lista_sala_2.pdf]]

---

## Próximos Conteúdos
[[Medidas de Dispersão]] 


![[Simulado com Gabarito]] 

