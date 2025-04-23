Java é umas das linguagens de programação mais famosas do mundo. E a principal linguagem que a Jtech usa.
## Conteúdo que iremos ver:
[[Variáveis - Java]]
[[Laços - Java]]
[[Estruturas de Decisão (If, Else e Switch-Case) - Java]]
[[Strings - Java]]
[[Arrays - Java]]
[[Métodos em Java]]

![[ALG - 5. Introdução ao Java.pdf]]

- Constantes, variáveis e tipos de dados
- Operadores aritméticos, relacionais e lógicos

# Lista de exercicios
![[ALG_lista4.pdf]]


---
## Atividades da lista
...
7. Implemente um algoritmo que conte qantas vezes uma palavra ocorre dentro de uma string maior. por exemplo, na string "Casa na casa da casa", a palabra "casa" ocorre 3 vezes.

```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in);  
        String texto = leitor.nextLine();  
        String palavra = leitor.next();  
        int contador = 0;  
        int indice = texto.indexOf(palavra);  
        while (indice != -1) {  
            contador++;  
            texto = texto.substring(0, indice) + texto.substring(indice + palavra.length());  
            indice = texto.indexOf(palavra);  
        }  
        System.out.println(contador);  
  
    }  
}
```

8. Implemente um algoritmo que normalize uma string removendo caracteres acentuados. Por exemplo, "João está programando" deve ser transfomada em "Joao esta programando"
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in);  
        String texto = leitor.nextLine();  
        String textoNormal = "";  
  
        for (int i = 0; i < texto.length(); i++) {  
            char caractere = texto.charAt(i);  
            switch (caractere) {  
                case 'á', 'à', 'ã', 'â':  
                    caractere = 'a';  
                    break;  
                case 'ê', 'é', 'è':  
                    caractere = 'e';  
                    break;  
                case 'ó', 'ò', 'õ', 'ô':  
                    caractere = 'o';  
                    break;  
  
            }textoNormal = textoNormal + caractere;  
        }  
        System.out.println(textoNormal);  
  
    }  
}
```

...

12. Escreva um algoritmo que aplique uma máscara para padronizar ima string de CPF para o formato "XXX.XXX.XXX-XX". Por exemplo, a entrada "12345678901" deve retornar "123.456.789-01".
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in);  
        String cpf = leitor.next();  
        String mascarado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);  
        System.out.println(mascarado);  
    }  
}
```

9. Escreva um programa que converta uma string fornecida pelo usuario para o formato CamelCase.
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in);  
        String texto = leitor.nextLine();  
        texto = texto.toLowerCase();  
        if(!texto.contains(" ")){  
            System.out.println(texto);  
        } else {  
            int indice = texto.indexOf(" ");  
            while (indice != -1) {  
                texto = texto.substring(0, indice) + texto.substring(indice + 2).toUpperCase() + texto.substring(indice + 2);  
                indice = texto.indexOf(" ");  
            }  
        }  
        System.out.println(texto);  
    }  
}
```


### Primeiro Sistema
[[Primeiro Sistema]]