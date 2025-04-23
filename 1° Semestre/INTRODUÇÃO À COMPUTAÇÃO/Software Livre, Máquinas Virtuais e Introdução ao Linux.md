[[Introdução à Computação e ao hardware]]

**Antes de começar:** Baixar uma imagem (arquivo .ISO) da distribuição Linux Debian para o seu computador do laboratório.

### Software Livre

- Apresentação
![[Software livre.pdf]]
- Referências
    - Banco do Brasil - Apresentação sobre o uso de Software Livre 
	    ![[Dantas - Software livre no banco do brasil.pdf]]
    - Governo Federal - Cartilha do Software Livre 
	    ![[Brasil - Cartilha de software livre.pdf]]
    - Viva o Linux - Artigos sobre Software Livre
        - [Software livre e a liberdade fundamental](https://www.vivaolinux.com.br/artigo/Software-livre-e-a-liberdade-fundamental)
        - [Software Livre e a liberdade de aprender](https://www.vivaolinux.com.br/artigo/Software-Livre-e-a-liberdade-de-aprender)
        - [Software Livre e a liberdade de compartilhar](https://www.vivaolinux.com.br/artigo/Software-Livre-e-a-liberdade-de-compartilhar)
        - [Software livre e a liberdade de contribuir](https://www.vivaolinux.com.br/artigo/Software-livre-e-a-liberdade-de-contribuir/)

### Máquinas virtuais

- Usadas para emular um computador (hardware) para instalação de um sistema operacional
- Forma de usar sistemas operacionais diferentes sem precisar ter várias máquinas diferentes
- Terminologia:
    - Sistema real: hospedeiro (host)
    - Sistema virtualizado: convidado (guest)
    - Hypervisors: sistemas que produz a virtualização
        - Tipo 2: rodam em cima de um Sistema Operacional (ex. VirtualBox, VMWare, etc)
        - Tipo 1: rodam diretamente no hardware, mais usado por empresas ou para sistemas de grande porte (ex. KVM)
    - Laboratório:
        - Criação de uma máquina virtual com o VirtualBox
        - Instalação do Debian
        - [Problema da instalação do Virtual Box Guest Additions](https://forums.virtualbox.org/viewtopic.php?t=58799) - Trocar "noauto" por "exec" em /etc/fstab (retornar após terminar)
    - Referências:
        - [Vídeo sobre termos em virtualização (Diolinux)](https://youtu.be/0t5HMbabeuo)
        - [Como instalar o Virtualbox no Linux](https://diolinux.com.br/tecnologia/como-instalar-o-virtualbox-6-1.html)
        - [Como instalar o Virtualbox no Windows](https://docs.oracle.com/cd/E19957-01/821-1695/installmac/index.html)
        - [Como criar uma máquina virtual com o VirtualBox](https://tecnoblog.net/responde/como-criar-uma-maquina-virtual-virtualbox/)

  

### Ótimas referências

- [Bite Size Linux, by Julia Evans](https://wizardzines.com/zines/bite-size-linux/)
- [The Linux Programming Interface: A Linux and UNIX System Programming Handbook, by Michael Kerrisk](https://www.amazon.com/Linux-Programming-Interface-System-Handbook/dp/1593272200)

