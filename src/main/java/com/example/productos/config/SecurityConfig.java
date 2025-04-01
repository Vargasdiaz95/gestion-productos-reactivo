/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.productos.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;
@Configuration
public class SecurityConfig {
    @Bean
public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
http
.authorizeExchange(exchanges -> exchanges
.pathMatchers("/api/**").authenticated()
.anyExchange().permitAll()
)
.httpBasic(Customizer.withDefaults())
.formLogin(Customizer.withDefaults());
return http.build();
}
@Bean
public MapReactiveUserDetailsService userDetailsService() {
UserDetails user = User.withDefaultPasswordEncoder()
.username("usuario")
.password("clave123")
.roles("USER")
.build();
return new MapReactiveUserDetailsService(user);
}

}
