package br.com.joao.linguagens.api; // Define o pacote onde a classe está localizada

import org.springframework.boot.SpringApplication; // Importa a classe SpringApplication para iniciar a aplicação Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importa a anotação @SpringBootApplication para habilitar a configuração automática do Spring Boot

// Anotação @SpringBootApplication indica que esta é a classe principal da aplicação Spring Boot
// e habilita a configuração automática, varredura de componentes e outras funcionalidades do Spring Boot
@SpringBootApplication
public class LinguagensApiApplication {

    // Método main é o ponto de entrada da aplicação. Ele inicia a aplicação Spring Boot
    public static void main(String[] args) {
        SpringApplication.run(LinguagensApiApplication.class, args); // Executa a aplicação Spring Boot, passando a classe principal e os argumentos da linha de comando
    }
}
