package br.com.joao.linguagens.api; // Define o pacote onde a interface está localizada

import org.springframework.data.mongodb.repository.MongoRepository; // Importa a interface MongoRepository do Spring Data MongoDB

// Define a interface LanguageRepository que estende MongoRepository,
// especificando que ela irá gerenciar entidades do tipo Language com IDs do tipo String
public interface LanguageRepository extends MongoRepository<Language, String> {

  // A interface não precisa definir métodos explicitamente, pois herda os métodos CRUD 
  // (Create, Read, Update, Delete) e outros métodos de consulta do MongoRepository
}
