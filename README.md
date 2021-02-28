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
  
No domínio do Weblogic onde a aplicação será publicada, deverá ser configurado um pool de conexões que estará disponível no nome JNDI  
```sh  
url: jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=exa01-scan6.intra.goias.gov.br)(PORT=1521))(CONNECT_DATA=(SERVER=SHARED)(SERVICE_NAME=orades)))  
JNDI: jdbc/aeo  
Usuário: “AGOUSER”  
Password: "AGO6ti5#D"
```  
## Publicações no Big-IP
#### Autenticação via porta:
* Local: http://localhost:8080/swagger-ui.html#/
* Desenvolvimento: http://localhost:8080/swagger-ui.html#/
* Homologação: https://apitouristspot.herokuapp.com/swagger-ui.html


## Autores  
  
#### Gerência de Tecnologia da Informação  
* Edu Rodrigues Braz | https://www.linkedin.com/in/edu-rodrigues-braz  | edurodriguesbraz@hotmail.com
