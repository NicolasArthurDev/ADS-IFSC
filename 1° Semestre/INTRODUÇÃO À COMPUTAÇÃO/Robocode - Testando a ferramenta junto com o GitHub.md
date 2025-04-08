[[Robocode]]
[[Controle de versão, Git e GitHub]]

Nesta aula, iremos realizar a instalação do Robocode, e testar a criação de um robô. Os robôs deverão ser sincronizados com um repositório no GitHub, fazendo uso dos comandos Git.

Passos:

1. Instalação do programa Robocode

- Baixar o instalador em [[https://robocode.sourceforge.io/](https://robocode.sourceforge.io/)]
- Na pasta do download, executar o comando java -jar robocode-1.9.5.2-setup.jar
- Editar o arquivo robocode.sh (gedit ~/robocode/robocode.sh), e realizar as seguintes alterações:

1. Retirar o . do início da linha 15, ficando na linha o comando ./set_java_version  
    
2. Adicionar a linha -Djava.security.manager=allow \ ao comando java

- Excecutar o robocode com ~/robocode/robocode.sh  
    

2. Criação de um robô dentro da ferramenta

- Ir no menu Robot e depois em Source Editor
- Ir no menu File e então em New e depois Robot
- Entrar com os nomes do robô e do pacote
- Editar alguma coisa no arquivo (pode ser um comentário), salvar, e compilar, no menu Compiler e depois em Compile

3. Criação de um repositório no GitHub para abrigar o projeto do robô e adição dos arquivos do robocode ao repositório do GitHub. Referências:

- [https://www.geeksforgeeks.org/how-to-add-code-on-github-repository/](https://www.geeksforgeeks.org/how-to-add-code-on-github-repository/) (realizar a tradução se for necessário)
- [https://cursos.alura.com.br/forum/topico-subir-um-projeto-existente-para-o-github-64968](https://cursos.alura.com.br/forum/topico-subir-um-projeto-existente-para-o-github-64968)