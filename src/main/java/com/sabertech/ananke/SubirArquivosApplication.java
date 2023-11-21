package com.sabertech.ananke;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.sabertech.ananke.config.ArmazenamentoProperties;
import com.sabertech.ananke.service.ArmazenamentoService;

@SpringBootApplication
@EnableConfigurationProperties(ArmazenamentoProperties.class)
public class SubirArquivosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubirArquivosApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ArmazenamentoService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
