package com.parcel.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Basic security configuration enabling HTTP Basic authentication for the
 * HOLDING_USER profile. Guests can access read-only endpoints without login.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails holdingUser = User.withUsername("holding")
                .password("{noop}password")
                .roles("HOLDING_USER")
                .build();
        return new InMemoryUserDetailsManager(holdingUser);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.POST, "/api/**").hasRole("HOLDING_USER")
                .requestMatchers(HttpMethod.GET, "/api/**").permitAll()
                .anyRequest().permitAll())
            .httpBasic();
        return http.build();
    }
}
