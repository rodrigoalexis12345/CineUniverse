package com.cineuniverse.grupo1.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/","/home","/peliculas/{id}", "/static/**", "/css/**", "/js/**", "/img/**").permitAll() // Permite acceso sin autenticación a la página de inicio u otros archivos.
                        .anyRequest().authenticated() // Requiere autenticación para cualquier otra ruta
                )
                .formLogin((form) -> form
                        .loginPage("/login") // Especifica tu página de login personalizada (opcional)
                        .permitAll() // Permite acceso a la página de login a todos
                )
                .logout((logout) -> logout.permitAll()); // Permite acceso al logout a todos

        return http.build();
    }
}
