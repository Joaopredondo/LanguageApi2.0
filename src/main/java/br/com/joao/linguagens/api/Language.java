package br.com.joao.linguagens.api; // Define o pacote onde a classe está localizada

import org.springframework.data.annotation.Id; // Importa a anotação @Id para marcar o campo identificador
import org.springframework.data.mongodb.core.mapping.Document; // Importa a anotação @Document para mapear a classe para uma coleção no MongoDB

// Anotação @Document indica que esta classe representa um documento no MongoDB, 
// e especifica o nome da coleção onde os documentos serão armazenados ("languagesApi")
@Document(collection = "languagesApi")
public class Language {

  // Anotação @Id marca este campo como o identificador único do documento no MongoDB
  @Id
  private String id;

  // Campo para armazenar o nome da linguagem de programação
  private String title;

  // Campo para armazenar a URL da imagem representando a linguagem
  private String image;

  // Campo para armazenar o ranking (posição) da linguagem em alguma lista ou classificação
  private int ranking;

  // Construtor padrão (vazio), necessário para o Spring Data criar objetos a partir dos dados do MongoDB
  public Language() {

  }

  // Construtor para criar uma nova instância da classe Language com os valores fornecidos
  public Language(String title, String image, int ranking) {
    this.title = title;
    this.image = image;
    this.ranking = ranking;
  }

  // Métodos getters para acessar os valores dos campos da classe (encapsulamento)
  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getImage() {
    return image;
  }

  public int getRanking() {
    return ranking;
  }
}
