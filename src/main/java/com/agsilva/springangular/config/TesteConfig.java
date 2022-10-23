package com.agsilva.springangular.config;

import com.agsilva.springangular.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("teste")
public class TesteConfig {
    @Autowired
    private DbService dbService;
    @Bean
    public void instanciaBaseDeDados(){
        this.dbService.instanciaBaseDeDados();
    }
}
