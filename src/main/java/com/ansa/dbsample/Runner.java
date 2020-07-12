package com.ansa.dbsample;

import com.ansa.dbsample.model.Article;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }

    @Bean
    public CommandLineRunner demo(ArticleRepository repository) {
        return (args) -> {
            repository.save(new Article("Sample Article", "system user"));
        };
    }

}
