package com.example.chilis.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("Chill's Tunisie").description("Restaurant Chill's").contact(contactAPI());
    }
    public Contact contactAPI() {
        Contact contact = new Contact().name("Oussama Lachiheb").email("oussama.lachiheb@esprit.tn").url("https://www.linkedin.com/in/oussama-lachiheb-0307811a1/");
        return contact;
    }
}

