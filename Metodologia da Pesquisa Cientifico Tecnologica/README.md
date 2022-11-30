# Lucas César Andrade

## Introdução
Olá, seja bem-vindo. Atualmente estudante de Banco de dados, porém cursei 3 semestres de Analise e desenvolvimento de sistemas.

### Meus principais conhecimentos
Meus principais conhecimentos são em **Python**, principalmente em frameworks como **Django** e **Flask**, mas, atualmente meu foco está sendo em **Java**
e **SQL**.

## Conteúdo:
### [Projeto 1](https://github.com/LucasACES/bertoti/tree/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica#projeto-1-2-semestre-de-2020)
### [Projeto 2](https://github.com/LucasACES/bertoti/tree/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica#projeto-2-1-semestre-de-2021)
### [Projeto 3](https://github.com/LucasACES/bertoti/tree/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica#projeto-3-2-semestre-de-2021)

---

# [Projeto 1: 2° Semestre de 2020](https://github.com/LucasACES/E-commerce_Django)
### Parceiro Acadêmico
Text here
### Descrição do Projeto
Text here
### Tecnologias adotadas na solução
Text here
### Contribuições Individuais
Text here

### Aprendizados Efetivos
Text here

# [Projeto 2: 1° Semestre de 2021](https://github.com/LucasACES/ProjetoGSW)
### Parceiro Acadêmico
Text here
### Descrição do Projeto
Text here
### Tecnologias adotadas na solução
Text here
### Contribuições Individuais
Text here

### Aprendizados Efetivos
Text here

# [Projeto 3: 2° Semestre de 2021](https://github.com/LucasACES/PROJETO-NESS)
#### :warning: Clique no titulo para ser redirecionado à página do projeto
### Parceiro Acadêmico
<img src="https://assets.website-files.com/60dcc4691817e11aa93685ab/60e0cda0e2f47717a3b228bf_open-graph.png" alt="IonicHealth" width="500"> <br>
##### IonicHealth (Fonte: https://assets.website-files.com/60dcc4691817e11aa93685ab/60e0cda0e2f47717a3b228bf_open-graph.png)

A IONIC Health é uma empresa especializada em inovação e transformação digital para a saúde. Estão integrados à Jornada Digital do Paciente, desenvolvendo soluções que automatizam, monitoram e teleoperam equipamentos clínicos.

### Descrição do Projeto

Para esse projeto a empresa solicitou a criação de um CRM, para administração das vendas e contatos com os clientes.

### Tecnologias adotadas na solução

<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/python.png?raw=true" width="15"> Python (Django)  
    -> Foi utilizado como base para o projeto, por ser um framework bem estruturado e com diversas bibliotecas que auxiliam a criação de plataformas web.  
    <br>

<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/html.png?raw=true" width="14"> HTML  
-> Utilizado para criar os elementos que compõem a visualizão de textos e objetos no navegador.
<br>

<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/css.png?raw=true" width="20"> CSS  
-> Utilizado para estilizar todos os elementos composto na plataforma web, desde cor até tamanho e fonte.

<br>

<img src="https://raw.githubusercontent.com/LucasACES/bertoti/ce72569c6d4920879802c1f7bb985a8611aa202b/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/javascript.svg" width="14"> JavaScript  
-> Utilizado para gerar graficos.
<br>

<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/mysql_logo_icon_169941.png?raw=true" width="50"> MySQL  
-> Utilizado para gerenciar o banco de dados utilizado no sistema.

<br>

---

### Contribuições Individuais
Nesse projeto fui responsável por toda estrutura e base do projeto, desde a lógica até o tratamento dos dados. Sendo responsável por criar, subir e manter o sistema rodando mesmo que localmente e criar e gerenciar o banco de dados.
#### Backend:
Na estrutura do sistema, optei por utilizar o django, um framework do Python, por ser um framework para sistemas mais incorporados e já ter por padrão uma estrutura, uma estrutura que para o projeto foi bem útil.
Para inserção, exclusão e atualização dos dados utilizei o método HTTP do django (HttpResponse).

<details >
<summary>Exemplo de obtenção de dados:</summary>
<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/chrome_Fwxvpf78uT.png?raw=true">

> Nesse código contém uma função que pega as informações dos leads no banco de dados e disponibiliza na tela "leads.html", ali ele espera pelo metodo GET para retornar os dados no contexto da pagina.
</details>
<br>
Além de modelar e restringir os dados que serão inseridos na plataforma afim de garantir que não seja inserido nada além do que realmente precisa.
Para restringir o acesso e criar uma hierarquia de acesso a plataforma, utilizei a biblioteca nativa do Django (login_required), fazendo assim que apenas pessoas com permissão acesse a plataforma.

Tendo uma hierarquia de permissões, todo o sistema já estava um pouco mais seguro e já dava para inserir os dados e distribuir cada dado para cada cargo especifico.

Todas as telas tem sua permissão e informação de acordo com cada cargo. O sistema não pode ser acessado sem um usuário.

<details >
<summary>Tela de login:</summary>
<img src="https://github.com/Time-1-ADS/PROJETO-NESS/raw/codes/imagens/Login.gif">

> Nesse GIF a informação principal a se perceber é que existe um método de segurança que impede que qualquer pessoa consiga acesso ao dados através do portal CRM. Mesmo que ela saiba o endereço de outras páginas, sempre que tentar acessar o CRM irá exigir uma credencial e caso não esteja autenticado sempre retornará para essa página.
</details>

#### Banco de dados:
Para salvar e manter os dados seguros, decidimos criar um banco de dados utilizando o SGBD MySql. Atráves dele fiz a criação e manipulação das tabelas que recebem os dados do sistema.
Utilizei um script inicial no sistema para criar as tabelas automaticamente e com o tipo correto de cada dado.  
Além disso foi criado um usuário especifico para o sistema para que o acesso ao dados por meio indevido seja mais dificil.

<details >
<summary>Exemplo de conexão utilizada:</summary>
<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/chrome_ub6wTUsYit.png?raw=true">

> Esse código foi gerado em um arquivo separado para manter mais seguro a conexão com o banco, ali temos um modelo onde é necessário preencher todos os campos, pois são obrigatórios no django para ter sucesso na conexão. Principalmente a ENGINE, que podemos "dizer" ao django qual banco iremos utilizar.
</details>

Um exemplo da conexão do banco com o sistema podemos ver abaixo, onde mostra a inserção no front-end, criado pelo HTML, CSS e estruturado pelo backend onde acontece toda a comunicação.

<details >
<summary>Inserção visto pelo usuário:</summary>
<img src="https://github.com/Time-1-ADS/PROJETO-NESS/raw/codes/imagens/novas-propostas.gif">

> Nesta tela podemos ver a inserção de uma nova proposta no sistema.
</details>

<details >
<summary>Comunicação com o banco de dados para salvar a proposta:</summary>
<img src="https://github.com/LucasACES/bertoti/blob/master/Metodologia%20da%20Pesquisa%20Cientifico%20Tecnologica/IMG/back_insercao.png?raw=true">

> Nesta tela podemos ver a inserção de uma nova proposta no sistema indo para o banco de dados atráves de um form criado em outro arquivo.
> Podemos ver que há uma condição que verifica se o metodo é GET ou POST, que define se irá recuperar dados do banco ou se irá inserir dados no banco.
</details>

<br>

### Aprendizados Efetivos

Neste projeto tive como maior aprendizado a operação de Insert, update e Delete utilizando o metodo REST.  
Um conhecimento maior no SGBD MySQL, que no caso foi a primeira vez em que coloquei em pratica para um projeto. Além de aprender mais sobre o framework do Django que eu já conhecia porém com diversos obstáculos durante o processo de criação me rendeu mais conhecimento e experiência com o framework.  
A integração com o frontend também foi um conhecimento a mais, apesar de eu já ter feito isso antes, foi um avanço muito grande onde eu realmente tive que estudar e aprender sobre boas práticas.

## Contatos
 - [LinkedIn](https://linkedin.com/in/lucasaces)
 - [E-mail](mailto:atomo.lambert_0q@icloud.com)
 - [GitHub](https://github.com/LucasACES)
