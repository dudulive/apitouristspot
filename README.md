# apitouristspot
RESTful API of tourist spots

> API RESTful para o aplicativo consumir e registrar essas informações de Pontos Turísticos.
## Tecnologias  
  
* JWT  
* Spring Framework (Core, JPA, JDBC, Data, Security e MVC)  
* PostgreSQL
  
## Principais Características  
* inscrição/login com e-mail e senha.

#### Como um usuário logado, desejo:
* Veja uma lista de pontos turísticos
* Procure pontos turísticos pelo nome.
* Registrar um ponto turístico (foto, nome, localização geográfica e categoria).
* Adicione fotos a um ponto turístico.
* Remover fotos que adicionei a um ponto turístico.
* Favorito um ponto turístico.
* Veja meus pontos turísticos favoritos.
* Remover um ponto turístico de meus favoritos.
* Criar novas categorias.
  
## Configuração para Desenvolvimento  
#### Pré-requisitos
* Para seguir este guia, é necessário ter instalado em sua máquina:
* Java JDK 8 ou superior
* Vscode
* PostgreSQL
#### Instalar extensões de suporte ao Java
* Java Extension Pack
* Spring Boot Extension Pack
#### Executando o projeto
* Abra a pasta no Vscode
* Agora execute o projeto utilizando a guia "spring-boot-dashboard"
* Neste momento sua aplicação Spring Boot já está em pé na porta 8080 (porta padrão). Abra seu navegador e vá até: http://localhost:8080/swagger-ui.html#/
* Para executar em modo de debug, basta ir no painel de debug, adicionar uma configuração padrão.
* O arquivo abaixo será adicionado num diretório oculto (.vscode)
* A partir deste momento basta clicar no botão verde de Run para sua aplicação rodar em modo de Debug. Faça o attach de seus breakpoints e aproveite o debug 

## Instruções de como implantar  
#### Só que quando vamos para produção, em geral vamos ter outras configurações. Alguns exemplos:
* Nome e dados de acesso do banco de dados
* Caminhos para escrita de arquivos

#### Essa ideia de environment já é bem suportada pelo Spring e o Spring Boot tira apenas proveito. Na hora que você passe o argumento -Dspring.profiles.active atribuindo o valor de ambiente que você quer.
* java -Dspring.profiles.active=production -jar webapp-runner.jar tudosobreesporte-1.0.0-SNAPSHOT.war& 
* Acima você está ensinando ao Spring Boot a procurar por um arquivo chamado application-production.properties.
  
## Publicações
* Local: http://localhost:8080/swagger-ui.html#/
* Desenvolvimento: http://localhost:8080/swagger-ui.html#/
* Homologação: https://apitouristspot.herokuapp.com/swagger-ui.html


## Autores  
  
#### Gerência de Tecnologia da Informação  
* Edu Rodrigues Braz | https://www.linkedin.com/in/edu-rodrigues-braz  | edurodriguesbraz@hotmail.com
