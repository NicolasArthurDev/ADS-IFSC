Vamos fazer um duelo de robôs, usando o Robocode, como forma de aplicação de ferramentas de controle de versão em desenvolvimento de software.

- [Apresentação](https://drive.google.com/file/d/12M0NatQjDu3mH6gddzHqU3DLGRipmv-5/view?usp=sharing)
- [Manual de instruções - Universidade Federal de Juíz de Fora](https://drive.google.com/file/d/12NB1nYsVe2Hdl7zR9pofMmqtBacpaOyO/view?usp=sharing)
- [Manual de instruções](https://drive.google.com/file/d/12KPpbY-KfGfcjGP2QpnDtM8gh6JHyGNF/view?usp=sharing)
- [Resumo de comandos](https://drive.google.com/file/d/12N_VoAChZIAH3PZ3sHlVprVxwBBtnYrk/view?usp=sharing)

Grupos:

**Nota:** na sua última versão, o Robocode está dando problema com o Security Manager do Java, e portanto está com dificuldade de execução. Para resolver o problema, abrir o arquivo _robocode.sh_, dentro da pasta de instalação do robocode (em geral, ~/robocode/robocode.sh), e acrescentar a expressão -Djava.security.manager=allow \ ao comando _java_ que executa o robocode, que ficara da seguinte forma:

# Run Robocode
```
java \

  -cp "libs/*" \

  -Xmx512M \

  -Xdock:name=Robocode \

  -Xdock:icon=robocode.ico \

  -XX:+IgnoreUnrecognizedVMOptions \

  "--add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED" \

  "--add-opens=java.base/java.lang.reflect=ALL-UNNAMED" \

  "--add-opens=java.desktop/javax.swing.text=ALL-UNNAMED" \

  "--add-opens=java.desktop/sun.awt=ALL-UNNAMED" \

  -Djava.security.manager=allow \

  robocode.Robocode "$@"

```