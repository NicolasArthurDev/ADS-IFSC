- Cadastrar Novos Alunos
- Lançar Notas
- Calcular conceito final
- Editar Nome
- Editar Nota
- Trancar Matrícula

```java
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
  
        Scanner leitor = new Scanner(System.in);  
  
        //Definições fixas  
        int opcao = 99;  
        int capacidade = 50;  
        int quantidadeAlunos = 0;  
        int quantidadeProvas = 0;  
  
        String[] alunos = new String[capacidade];  
        double[][] notas = new double[capacidade][3];  
        while (opcao > 0) {  
            System.out.println("""  
                    +---- SISTEMA DE CADASTRO ----+                    | 1 - Cadastrar aluno         |                    | 2 - Lançar notas            |                    | 3 - Calcular conceito final |                    | 4 - Editar nomes            |                    | 5 - Editar notas            |                    | 6 - Trancar matrícula       |                    | 0 - Sair                    |                    +-----------------------------+                    """);  
            System.out.print("Digite a sua opção: ");  
            opcao = leitor.nextInt();  
  
            switch (opcao) {  
                case 1:  
                    System.out.println("Digite o nome do aluno:\n");  
                    String nome = leitor.next();  
                    alunos[quantidadeAlunos] = nome;  
                    quantidadeAlunos++;  
                    imprimeTurma(alunos, quantidadeAlunos);  
                    break;  
                case 2:  
                    for (int i = 0; i < quantidadeAlunos; i++) {  
                        System.out.println("Digite a nota para " + alunos[i]);  
                        notas[i][quantidadeProvas] = leitor.nextDouble();  
                    }  
                    quantidadeProvas++;  
                    imprimeNota(notas, quantidadeAlunos, quantidadeProvas);  
                    break;  
                case 3:  
                    System.out.println("Conceito Calculado");  
                    break;  
                case 4:  
                    System.out.println("Nomes editados");  
                    break;  
                case 5:  
                    System.out.println("Notas editadas");  
                    break;  
                case 6:  
                    System.out.println("Matrícula trancada");  
                    break;  
                case 0:  
                    System.out.println("Saindo...");  
                    break;  
                default:  
                    System.out.println("Opção inválida!");  
            }  
        }  
  
  
    }  
  
    static void imprimeTurma(String[] alunos, int quantidade) {  
        for (int i = 0; i < quantidade; i++) {  
            System.out.println(alunos[i]);  
        }  
    }  
      
    static void imprimeNota(double[][] notas, int quantidadeAlunos, int quantidadeProvas){  
        for (int i = 0; i < quantidadeAlunos; i++) {  
            for (int j = 0; j < quantidadeProvas; j++) {  
                System.out.println(notas[i][j]);  
            }  
              
        }  
    }  
}
```