###### Conteúdo relacionado a [[Matrizes]]
---

Dada uma matriz A$n*n$, o Determinante de A, denotado por $Det(A)$ ou $|A|$ é um número associado à matrizes, vejamos como calculá-la.

### Caso 1x1 $$M = [a]1x1$$  $$det(M) = a$$
Exemplo:
#### $A = [-3] \implies det(A) = -3$ ou $|A| = -3$

--- 
### Caso 2x2  $$A=
\begin{bmatrix}
a & b \\
c & d \\
\end{bmatrix} = ad - bc$$$$\det(A) =  ad - bc$$
Exemplos:
1) $$A = \begin{bmatrix}
1 & 3\\
2 & 4\\
\end{bmatrix} 
\implies det(A) = 4-6 = -2
$$
2) $$A = \begin{bmatrix}
5 & 1\\
-8 & 0\\
\end{bmatrix} 
\implies det(A) = 8
$$
---
### Caso 3x3  $$A=
\begin{vmatrix}
a & b & c \\
d & e & f \\
g & h & i \\
\end{vmatrix}
$$$$\det(A) = a(ei - fh) - b(di - fg) + c(dh - eg)$$
## Método de Sarrus:
A Regra de Sarrus é um método prático para calcular o determinante de uma matriz 3×33×3. Ela envolve a repetição das duas primeiras colunas da matriz e o cálculo da soma dos produtos das diagonais principais, menos a soma dos produtos das diagonais secundárias.

$$A = \begin{bmatrix}
a & b & c \\
d & e & f \\
g & h & i
\end{bmatrix}$$
$$\det(A) = \begin{vmatrix}
a & b & c \\
d & e & f \\
g & h & i
\end{vmatrix}
$$$$\det(A)= aei + bfg + cdh - ceg - bdi - afh$$ $$\begin{array}{|ccc|cc}
a & b & c & a & b \\
d & e & f & d & e \\
g & h & i & g & h \\
\end{array}$$
$$aei + bfg + cdh$$
$$- (ceg + afh + bdi )$$

$$\det(A) = aei + bfg + cdh - ceg - afh - bdi$$]

