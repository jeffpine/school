package com.pine.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desabilitar CSRF (para simplificação, pode ser ajustado conforme necessidade)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/director/**").hasRole("DIRECTOR")
                        .requestMatchers("/secretary/**").hasRole("SECRETARY")
                        .requestMatchers("/teacher/**").hasRole("TEACHER")
                        .requestMatchers("/advisor/**").hasRole("ADVISOR")
                        .requestMatchers("/student/**").hasRole("STUDENT")
                        .anyRequest().authenticated()
                )
                .httpBasic(); // Autenticação básica (ou pode ser JWT)

        return http.build();
    }

    // Define o encoder para senhas
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Expor o AuthenticationManager para injeção, necessário para autenticação personalizada
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
}
