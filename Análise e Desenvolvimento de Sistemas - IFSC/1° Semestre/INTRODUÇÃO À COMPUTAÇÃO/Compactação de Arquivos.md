[[Linux no Modo Texto]]

![[Compactadores.pdf]]

[O que fazem os compactadores/descompactadores?](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18.html#cpctd-oque)
[Tipos de compactação](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18.html#cpctd-tipos)
[Extensões de arquivos compactados](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s02.html)
[gzip](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s03.html)
[zip](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s04.html)
[unzip](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s05.html)
[tar](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s06.html)
[bzip2](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s07.html)
[rar](https://www.guiafoca.org/guiaonline/inicianteintermediario/ch18s08.html)

Esta seção explica o que são e como usar programas compactadores no **GNU/Linux**, as características de cada um, como identificar um arquivo compactado e como descompactar um arquivo compactado usando o programa correspondente.

A utilização de arquivos compactados é método útil principalmente para reduzir o consumo de espaço em disco ou permitir grandes quantidades de texto serem transferidas para outro computador através de disquetes.

## O que fazem os compactadores/descompactadores?

Compactadores são programas que diminuem o tamanho de um arquivo (ou arquivos) através da substituição de caracteres repetidos. Para entender melhor como eles funcionam, veja o próximo exemplo:

compactadores compactam e deixam arquivos compactados.

-- após a compactação da frase --

%dores %m e deixam arquivos %dos

O que aconteceu realmente foi que a palavra `compacta` se encontrava 3 vezes na frase acima, e foi substituída por um sinal de `%`. Para descompactar o processo seria o contrário: Ele substituiria % por `compacta` e nós temos a frase novamente restaurada.

Você deve ter notado que o tamanho da frase `compactada` caiu quase pela metade. A quantidade de compactação de um arquivo é chamada de _taxa de compactação_. Assim se o tamanho do arquivo for diminuído a metade após a compactação, dizemos que conseguiu uma _taxa de compactação_ de 2:1 (lê-se dois para um), se o arquivo diminuiu 4 vezes, dizemos que conseguiu uma compactação de 4:1 (quatro para um) e assim por diante.

Para controle dos caracteres que são usados nas substituições, os programas de compactação mantém cabeçalhos com todas as substituições usadas durante a compactação. O tamanho do cabeçalho pode ser fixo ou definido pelo usuário, depende do programa usado na compactação.

Este é um exemplo bem simples para entender o que acontece durante a compactação, os programas de compactação executam instruções muito avançadas e códigos complexos para atingir um alta taxa de compactação.

Observações:

- Não é possível trabalhar diretamente com arquivos compactados! É necessário descompactar o arquivo para usa-lo. Note que alguns programas atualmente suportam a abertura de arquivos compactados, mas na realidade eles apenas simplificam a tarefa descompactando o arquivo, abrindo e o recompactando assim que o trabalho estiver concluído.
    
- Arquivos de texto tem uma taxa de compactação muito melhor que arquivos binários, porque possuem mais caracteres repetidos. É normal atingir taxas de compactação de 10 para 1 ou mais quando se compacta um arquivo texto. Arquivos binários, como programas, possuem uma taxa de compactação média de 2:1.
    
- Note que também existem programas compactadores especialmente desenvolvidos para compactação de músicas, arquivos binários, imagens, textos.
    

### Tipos de compactação

Existem basicamente dois tipos de compactação, a compactação _sem perdas_ e a compactação _com perdas_.

Os exemplos a seguir tentam explicar de forma simples os conceitos envolvidos.

A compactação sem perdas, como o próprio nome diz não causa nenhuma perda nas informações contidas no arquivo. Quando você compacta e descompacta um arquivo, o conteúdo é o mesmo do original.

A compactação com perdas é um tipo específico de compactação desenvolvido para atingir altas taxas, porém com perdas parciais dos dados. É aplicada a tipos de arquivos especiais, como músicas e imagens ou arquivos que envolvam a percepção humana.

Sabe-se que o ouvido humano não é tão sensível a determinados sons e freqüências, então a compactação de um arquivo de música poderia deixar de gravar os sons que seriam pouco percebidos, resultando em um arquivo menor. Uma compactação do tipo _ogg_ ou _mp3_ utiliza-se destes recursos. O arquivo resultante é muito menor que o original, porém alguns dados sonoros são perdidos. Você só notaria se estivesse reproduzindo a música em um equipamento de alta qualidade e se tivesse um ouvido bem aguçado. Para efeitos práticos, você está ouvindo a mesma música e economizando muito espaço em disco.

Outro exemplo de compactação com perdas são as imagens _jpg_. Imagine que você tem uma imagem com 60000 tons de cor diferentes, mas alguns tons são muito próximos de outros, então o compactador resume para 20000 tons de cor e a imagem terá 1/3 do tamanho original e o nosso olho conseguirá entender a imagem sem problemas e quase não perceberá a diferença. Exemplos de extensões utilizadas em imagens compactadas são _jpg_, _png_, _gif_.

Apesar das vantagens da grande taxa de compactação conseguida nos processos com perdas, nem sempre podemos utilizá-lo. Quando compactamos um texto ou um programa, não podemos ter perdas, senão o nosso texto sofre alterações ou o programa não executa. Nem mesmo podemos tem perdas quando compactamos imagens ou musicas que serão utilizadas em processos posteriores de masterização, mixagem ou impressão em alta qualidade.