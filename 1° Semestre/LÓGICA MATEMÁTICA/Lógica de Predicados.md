Proposições Singulares - [[Lógica Proposicional - Conceitos Iniciais e Conectivos |Lógica Proposicional]]  

Lógica de Predicados
- Quantificadores
- Variáveis
- Funções

**Variável**: representa todos os elementos de um conjunto.

**Função Proposicional**: Predicado associado a uma ou mais variáveis.

Exemplos:
- Brasileiros: B(x)
- Humanos: H(x)
- Platão (p): Platão é humano. H(p)

A) Todos os Humanos são mortais.
B) Platão é Humano.
C) Logo, Platão é mortal

$$
A \land B \to C
$$

### Quantificadores:
- **Universal**: Para todo, para qualquer que seja. $\forall$ 
- **Existencial**: Existe pelo menos um. $\exists$

**Universal Afirmativa**: Todo S é P.
$$ \forall x(S(x) \to P (x)) $$
**Universal Negativa**. Nenhum S é P.
$$ \forall x(S(x) \to\neg P(x)) $$
**Particular Afirmativa**: Algum S é P.
$$\exists x (S(x) \land P(x))$$
**Particular Negativa**: Algum S não é P.
$$\exists x (S(x) \land\neg P(x))$$ 

Podemos colocar negações na frente de Quantificadores, por exemplo, colocando "$\neg$"  antes do **Universal Afirmativa**: $\forall x(S(x) \to P (x)) \implies \neg \exists x (S(x) \land\neg P(x))$ 

### Negativa dos Quantificadores
**Universal Afirmativa**: Todo S é P.
$$\neg \exists x (S(x) \land\neg P(x))$$ 
**Universal Negativa**. Nenhum S é P. 
$$\neg \exists x (S(x) \land P(x))$$
**Particular Afirmativa**: Algum S é P. 
$$\neg \forall x(S(x) \to\neg P(x)) $$**Particular Negativa**: Algum S não é P.
$$\neg \forall x(S(x) \to P (x)) $$

Exemplos: 
- Todos os quadriláteros são polígonos. $\forall x(Q(x) \to P(x))$ 
- Nenhum polígono é um tridimensional. $\forall x (P(x) \to \neg T(x))$
- O losango é um quadrilátero. $Q(l)$
- O losango é um polígono. $P(l)$

Exemplo de argumento:
- $\forall x(Q(x)\to P(x)) \land Q(l) \to P(l)$  

--------------------------------------------------------------------

## Função Proposicional
$Px$        $P(x)$
$B(x)$    $B(a)$   
### Quantificadores

- Universal: $\forall$        $\forall x$
- Existencial: $\exists$      $\exists x$   

| ==Frase==       | ==Expressão==                      | ==Negativa==                            |
| --------------- | ---------------------------------- | --------------------------------------- |
| Todo S é P      | $\forall x(s(x) \to P(x))$         | $\neg \exists x (S(x) \land \neg P(x))$ |
| Nenhum S é P    | $\forall x(s(x) \to \neg P(x))$    | $\neg \exists x (S(x) \land P(x))$      |
| Algum S é P     | $\exists x (s(x) \land P(x))$      | $\forall x(s(x) \to \neg P(x))$         |
| Algum S não é P | $\exists x (s(x) \land \neg P(x))$ | $\forall x(s(x) \to P(x))$              |

----

## Exercícios Complementares
Expressar formalmente (em termos de conectivos, variáveis, constantes e quantificadores) os argumentos apresentados a seguir.

> (1)  Ácidos e bases são produtos químicos. $\forall x(A(x) \to (x)) \land \forall x(B(x)\to P(x))$  
>  O vinagre é um ácido. $A(v)$
>  Logo, o vinagre é um produto químico. $P(v)$

Argumento Formalizado: 
$$\forall x(A(x) \to (x)) \land \forall x(B(x)\to P(x)) \land A(v) \to P(v)$$

> (2) Todos os que estavam doentes foram medicados. $\forall x(D(x) \to M(x))$
> Alguns indivíduos não foram medicados. $\exists x(I(x) \land \neg M(x))$
> Portanto, nem todos estavam doentes. $\exists x(\neg D(x))$

Argumento Formalizado: 
$$\forall x (D(x) \to M(x)) \land \exists x (I(x) \land \neg M(x)) \land \exists x(\neg D(x))$$

> (3) Há pelo menos um estudante na turma que não leu o livro texto. $\exists x(E(x) \land \neg L(x))$
> Todos os alunos foram bem na primeira prova. $\forall x(E(x) \to B(x))$
> Logo, alguém que foi bem na prova não leu o livro texto. $\exists x(B(x) \land \neg L(x))$

Argumento Formalizado: $$\exists x (E(x)\land \neg L(x)) \land \forall x(E(x) \to B(x)) \land \to \exists x(B(x) \land \neg L(x))$$

> (4) Nenhum jogador é feliz. $\forall x(J(x) \to \neg F(x))$
> Alguns idealistas são felizes. $\exists x(I(x) \land F(x))$
> Portanto, alguns idealistas não são jogadores. $\exists x(I(x) \land \neg J(x))$

Argumento Formalizado: $$\forall x(J(x) \to \neg F(x)) \land \exists x (I(x) \land F(x)) \to \exists x (Ix) \land \neg J(x))$$

> (5) Alguns elementos químicos são metais. $\exists x(E(x) \land M(x))$
> Todos os metais são bons condutores de eletricidade. $\forall x(M(x) \land B(x))$
> Logo, alguns elementos químicos são bons condutores de eletricidade. $\exists x(E(x) \land B(x))$

Argumento Formalizado: 
$$\exists x (E(x) \land (M(x)) \land \forall x(M(x) \land B(x)) \to \exists x(E(x) \land B(x))$$ 
## Exercício 2
1) Expressar formalmente (em termos de conectivos, variáveis, constantes e quantificadores) as proposições apresentadas. (DICA! "$\exists$" não se usa "$\to$")

|     | Proposições                                    | Formalização |
| --- | ---------------------------------------------- | ------------ |
| (a) | Todos os cientistas são filósofos.             |              |
| (b) | Todos os filósofos são cientistas.             |              |
| (c) | Nenhum cientista é filósofo.                   |              |
| (d) | Nenhum filósofo é cientista.                   |              |
| (e) | Alguns cientistas são filósofos.               |              |
| (f) | Alguns filósofos são cientistas.               |              |
| (g) | Alguns cientistas não são filósofos.           |              |
| (h) | Alguns filósofos não são cientistas.           |              |
| (i) | Alguns não cientistas não são filósofos.       |              |
| (j) | Alguns escritores são filósofos e cientistas.  |              |
| (k) | Alguns escritores são filósofos ou cientistas. |              |
| (l) | Alguns escritores e cientistas são filósofos.  |              |
| (m) | Alguns escritores ou cientistas são filósofos. |              |
| (n) | Algumas cidades são capitais de um país.       |              |
| (o) | Todos os países têm uma capital.               |              |

2) Expressar, formalmente e em linguagem natural, a negação das proposições apresentadas na questão 1.


3) Expressar formalmente (em termos de conectivos, variáveis, constantes e quantificadores) o argumento apresentado a seguir. Verificar a validade do argumento:

>*Todos os gregos são europeus. Todos os italianos são europeus. Dante é italiano. Sócrates é grego. Logo, Dante e Sócrates são europeus.* 

![[LÓGICA - texto predicados.pdf]]

![[LOG exercícios predicados.pdf]]

![[exercícios lógica de predicados - resolução.pdf]]


![[LOG - lógica de predicados - exercícios 2.pdf]]


![[lógica de predicados - exercícios 2 - resolução.pdf]]


![[LOG MAT 2024-3 Lógica de Predicados exercícios3.pdf]]