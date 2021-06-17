# ProjetoNoBugs

<h1>🚀 [   ACCADEMIA ACCENTURE QA   ] </h1>

### Time QA: Jennefer Pequeno, Julia Paulino, Jéssica Bianca, Jéssica Lira, Jeanne Barbosa, Kamila Feitosa</h2>

###  💻 Tecnologias utilizadas: Cucumber, Selenium Web Driver, Junit, Java & Trello

## Trello: https://trello.com/b/F68pTAcE/no-bugs-projeto-qa-accenture

<br>

# O desafio
## Validar cenários dentro do site da accenture.com/br-pt

<br>

# Casos de teste

**Cenário 1:** Aceitar o cookie LGPD<br>
 
**Cenário 2:** Configurações do cookie<br>

**Cenário 3:** Listar serviços da Accenture<br>

**Cenário 4:** Clicar no serviço cloud<br>

**Cenário 5:** Acessar o item de vagas de tecnologia<br>

**Cenário 6:** Procurando uma vaga <br>

**Cenário 7:** Ver as características da accenture<br>

<br>

# Pré requisitos

1. Instalar o Java: <br>
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

2. Instalar JDK 11.0.1<br>
https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html

3. Verificar em variáveis de ambiente se  JAVA_HOME está configurado com o caminho indicando para<br> 
<b>\Program Files\Java\jdk-11.0.11</b>

4. Adicionar em path em variáveis de ambiente em 'Variáveis do sistema' o caminho indicando para<br>
<b>\Program Files\Java\jdk-11.0.11\bin </b>

5. Instalação do Eclipse<br>
https://www.eclipse.org/downloads/<br>

Observação: após instalação e abertura do projeto dentro do eclipse é necessário configurar na aba: Window > Preferences > Abra General > Clique em Workspace > Altere o campo 'Text file encoding' para 'Other' e selecione 'UTF-8 > clique em 'Apply and Close'

6. Baixar e descompactar o ChromeDriver, alterando o caminho no projeto:<br>
<b>Abra o chrome e verifique a versão do chrome em 'Sobre o Google Chrome' e posteriormente instale o chrome driver de acordo com a versão do seu chrome

https://chromedriver.chromium.org/downloads<br>

 Descompacte o arquivo e copie o caminho para efetuar a seguinte modificação:
 
 <b>IMPORTANTÍSSIMO:</b> Ao abrir o projeto aponte para o chromedriver que está na sua máquina: <br> 
System.setProperty("webdriver.chrome.driver", "caminhoNaSuaMáquina\chromedriver.exe");
<br>

# Clone do projeto

```bash
git clone https://github.com/jkpequeno/NoBugs.git
 ```





