package br.unicesumar.escoladeti2015base;

import br.unicesumar.escoladeti2015base.pais.PaisRepository;
import br.unicesumar.escoladeti2015base.pais.PaisRepositoryInMemory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);        
    }
    
    @Bean
    public PaisRepository criarPaisRepository() {
        return new PaisRepositoryInMemory();
    }
}
