![[ALG - 11. Arrays.pdf]]

### Exercícios
- Lista 13
![[ALG_lista13.pdf]]

[[Arrays Multidimensionais - Java]]

Exercicios:
1) 
```java

import java.util.Arrays;  
import java.util.Scanner;  
  
public class treinando {  
    public static void main(String[] args) {  
  
        int[] numeros = {1,2,3,4,5};  
        int soma = 0;  
        for (int i = 0; i < numeros.length; i++) {  
            soma = soma + numeros[i];  
        }  
  
        System.out.println("A soma da sequencia " + Arrays.toString(numeros) + " é " + soma);  
    }  
}
```