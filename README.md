# LanguageApi2.0
API RESTful desenvolvida com Spring Boot para gerenciar informações sobre linguagens de programação, utilizando MongoDB como banco de dados.

Funcionalidades:

Armazenamento de dados: O projeto utiliza o MongoDB, um banco de dados NoSQL orientado a documentos, para armazenar informações sobre as linguagens de programação. A classe Language representa a estrutura de dados de uma linguagem, com campos como nome (title), imagem (image) e ranking (ranking).

Endpoints REST: A API expõe os seguintes endpoints para interagir com os dados das linguagens:

GET /languages: Retorna uma lista de todas as linguagens cadastradas.
POST /languages: Permite adicionar uma nova linguagem ao banco de dados.
DELETE /languages/{id}: Remove a linguagem com o ID especificado.
Persistência de dados: A interface LanguageRepository, que estende MongoRepository, fornece métodos para realizar operações CRUD (criar, ler, atualizar e deletar) no banco de dados MongoDB de forma simplificada.

Arquitetura em camadas: O projeto segue uma arquitetura em camadas, com a classe LanguageController atuando como controlador, responsável por receber as requisições HTTP, interagir com o repositório (LanguageRepository) e retornar as respostas adequadas.

Usos:

Catálogo de linguagens: A API pode ser utilizada para criar um catálogo de linguagens de programação, permitindo listar, adicionar e remover informações sobre as linguagens.
Comparação de linguagens: As informações armazenadas (como ranking) podem ser usadas para comparar diferentes linguagens de programação.

Observações:
O projeto não possui um endpoint para atualizar informações de uma linguagem existente.
A API não implementa nenhum tipo de autenticação ou autorização, o que significa que qualquer pessoa pode acessar e modificar os dados.
A estrutura do projeto sugere que ele pode ser facilmente estendido para adicionar mais funcionalidades, como filtros de busca, ordenação e paginação.
Em resumo, o projeto "LinguagensApiApplication" é um ponto de partida para a criação de uma API RESTful completa para gerenciar informações sobre linguagens de programação, com potencial para ser expandido e customizado de acordo com as necessidades da aplicação.
