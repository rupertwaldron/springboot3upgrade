package com.ruppyrup.spring3factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {
    @Bean
    public Greeting greeting() {
        return new Greeting();
    }
}
