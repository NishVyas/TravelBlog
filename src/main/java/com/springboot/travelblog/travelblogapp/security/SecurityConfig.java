package com.springboot.travelblog.travelblogapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "SELECT user_id, pw, active FROM members WHERE user_id=?"
        );
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "SELECT user_id, role FROM roles WHERE user_id=?"
        );

        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/dataRest-api/travelBloggers").hasRole("BLOGGER")
                        .requestMatchers(HttpMethod.GET, "/dataRest-api/travelBloggers/**").hasRole("BLOGGER")
                        .requestMatchers(HttpMethod.POST, "/dataRest-api/travelBloggers").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/dataRest-api/travelBloggers/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/dataRest-api/travelBloggers/**").hasRole("ADMIN")
        );

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();
    }

    /*
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("BLOGGER")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("BLOGGER", "MANAGER")
                .build();

        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("BLOGGER", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(john, mary, susan);
    }
     */
}
