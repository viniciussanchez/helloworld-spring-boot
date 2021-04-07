package br.com.sanchez.helloworld.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping("/app")
    public String getAppMessage() {
        return this.appMessage;
    }

    @GetMapping("/env")
    public String getDbEnvironmentVariable() {
        return "A seguinte variável de ambiente foi passada: " + this.dbEnvironmentVariable;
    }
}