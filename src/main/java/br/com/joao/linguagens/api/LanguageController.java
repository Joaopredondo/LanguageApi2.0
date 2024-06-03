package br.com.joao.linguagens.api; // Define o pacote onde a classe está localizada

import java.util.List; // Importa a classe List para trabalhar com listas de linguagens

import org.springframework.beans.factory.annotation.Autowired; // Importa a anotação @Autowired para injeção de dependências
import org.springframework.http.HttpStatus; // Importa a classe HttpStatus para definir códigos de status HTTP
import org.springframework.http.ResponseEntity; // Importa a classe ResponseEntity para criar respostas HTTP com corpo e status
import org.springframework.web.bind.annotation.DeleteMapping; // Importa a anotação @DeleteMapping para mapear métodos DELETE
import org.springframework.web.bind.annotation.GetMapping; // Importa a anotação @GetMapping para mapear métodos GET
import org.springframework.web.bind.annotation.PostMapping; // Importa a anotação @PostMapping para mapear métodos POST
import org.springframework.web.bind.annotation.RequestBody; // Importa a anotação @RequestBody para extrair dados do corpo da requisição
import org.springframework.web.bind.annotation.RequestParam; // Importa a anotação @RequestParam para extrair parâmetros da URL
import org.springframework.web.bind.annotation.ResponseBody; // Importa a anotação @ResponseBody para indicar que o retorno do método deve ser o corpo da resposta
import org.springframework.web.bind.annotation.RestController; // Importa a anotação @RestController para indicar que a classe é um controlador REST

// Anotação @RestController indica que esta classe é um controlador REST, 
// responsável por lidar com requisições HTTP e retornar respostas
@RestController
public class LanguageController {

    // A anotação @Autowired injeta uma instância de LanguageRepository neste campo,
    // permitindo que o controlador acesse o repositório para interagir com o banco de dados
    @Autowired
    private LanguageRepository repository;

    // Anotação @GetMapping mapeia este método para lidar com requisições GET na URL "/languages"
    @GetMapping(value = "/languages")
    public List<Language> obtainLanguages() {
        // Obtém todas as linguagens do repositório e retorna uma lista delas
        List<Language> languages = repository.findAll();
        return languages;
    }

    // Anotação @PostMapping mapeia este método para lidar com requisições POST na URL "/languages"
    @PostMapping(value = "/languages")
    public Language newLanguage(@RequestBody Language language) { // A anotação @RequestBody extrai os dados da linguagem do corpo da requisição
        // Salva a linguagem no repositório e retorna a linguagem salva
        Language savedLanguage = repository.save(language);
        return savedLanguage;
    }

    // Anotação @DeleteMapping mapeia este método para lidar com requisições DELETE na URL "/languages/{id}"
    @DeleteMapping(value = "/languages/{id}")
    @ResponseBody // A anotação @ResponseBody indica que o retorno do método (uma mensagem de sucesso) deve ser o corpo da resposta
    public ResponseEntity<String> deleteLanguage(@RequestParam String id) { // A anotação @RequestParam extrai o ID da linguagem da URL
        // Remove a linguagem com o ID fornecido do repositório
        repository.deleteById(id);
        // Retorna uma resposta HTTP com a mensagem de sucesso e o código de status HTTP OK (200)
        return new ResponseEntity<String>("Linguagem deletada com sucesso", HttpStatus.OK);
    }
}
