![[ALG - 10. Strings.pdf]]

Correção
1
```java 
import java.util.Scanner;  
  
public class treinando {  
    public static void main(String[] args) {  
  
        Scanner sc = new Scanner(System.in);  
        String texto = sc.nextLine();  
  
        for (int i = 0; i < texto.length(); i++) {  
            char letra = texto.charAt(i);  
  
  
            switch (letra) {  
                case 'a','A','ã','Ã','â','Â':  
                    break;  
                case 'e':  
                    break;  
                case 'i':  
                    break;  
                case 'o':  
                    break;  
                case 'u':  
                    break;  
                default:  
                    System.out.print(letra);  
                    break;  
            }  
        }  
  
    }  
}
```

2
```java
import java.util.Scanner;  
  
public class treinando {  
    public static void main(String[] args) {  
  
        Scanner sc = new Scanner(System.in);  
        String texto = sc.nextLine();  
  
        for (int i = 0; i < texto.length(); i++) {  
  
                char letra = texto.charAt(texto.length() - 1 -i);  
            System.out.print(letra);  
        }  
    }  
  
}
```


## Exercicios:
![[ALG_lista11.pdf]]

Correção:

Exercicios 01
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
  
        Scanner leitor = new Scanner(System.in);  
        System.out.print("Digite o texto: ");  
        String texto = leitor.nextLine();  
        int tamanho = texto.length();  
        System.out.println(tamanho + " caracteres.");  
    }  
}
```

Exercicios 02
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
  
        Scanner leitor = new Scanner(System.in);  
        System.out.print("Digite o texto: ");  
        String texto = leitor.nextLine();  
        String textoSemEspaco = texto.replace(" ", "");  
  
        System.out.println(textoSemEspaco);  
    }  
}
```

Exercicio 03:
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
  
        Scanner leitor = new Scanner(System.in);  
        System.out.print("Digite o texto: ");  
        String texto = leitor.nextLine();  
        String textoMinusculo = texto.toLowerCase();  
  
        int contador = 0;  
        for (int i = 0; i < textoMinusculo.length(); i++) {  
            char letra = textoMinusculo.charAt(i);  
            switch (letra) {  
                case 'a':  
                    contador++;  
                    break;  
                case 'e':  
                    contador++;  
                    break;  
                case 'i':  
                    contador++;  
                    break;  
                case 'o':  
                    contador++;  
                    break;  
                case 'u':  
                    contador++;  
                    break;  
            }  
  
        }  
        if (contador == 1) {  
            System.out.println(contador + " vogal");  
        } else {  
            System.out.println(contador + " vogais");  
        }  
    }  
}
```

Exercicio 04:
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
  
        Scanner leitor = new Scanner(System.in);  
        System.out.print("Digite o texto: ");  
        String texto = leitor.nextLine();  
        String textoSemEspaco = texto.replace(" ", "");  
        String textoMinusculo = textoSemEspaco.toLowerCase();  
        boolean ehPalindromo = true;  
        for (int i = 0; i < textoMinusculo.length(); i++) {  
            if (textoMinusculo.charAt(i) != textoMinusculo.charAt(textoMinusculo.length() - i - 1)) {  
                ehPalindromo = false;  
            }  
        }  
        if(ehPalindromo){  
            System.out.print("sim");  
        } else {  
            System.out.print("nao");  
        }  
    }  
}
```

Exercicio 05:
```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
  
        Scanner leitor = new Scanner(System.in);  
        System.out.print("Digite o texto: ");  
        String texto = leitor.nextLine();  
        System.out.print("Digite o caractere: ");  
        String letra = leitor.nextLine();  
        String textoSemEspaco = texto.replace(" ", letra);  
  
        System.out.println(textoSemEspaco);  
  
    }  
}
```

Exercicio 06:

```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
  
        Scanner leitor = new Scanner(System.in);  
        System.out.print("Digite o texto: ");  
        String texto = leitor.nextLine();  
        texto = texto.trim();  
  
        while (texto.contains("  ")) {  
            texto = texto.replace("  ", " ");  
        }  
  
        int contador = 1;  
        for (int i = 0; i < texto.length(); i++) {  
            if (texto.charAt(i) == ' ') {  
                contador++;  
            }  
        }  
        System.out.println(contador);  
    }  
}
```

![[ALG_lista12.pdf]]
exercicio 10
```
String texto = "armandiinhooo eehh ooo terrorr ne paeeee";  
texto = texto + " ";  
String textoFormatado = "";  
for (int i = 0; i < texto.length() - 1; i++) {  
    char letra = texto.charAt(i);  
    if (letra != texto.charAt(i + 1)) {  
        textoFormatado = textoFormatado + letra;  
    }  
}  
System.out.println(textoFormatado);
```