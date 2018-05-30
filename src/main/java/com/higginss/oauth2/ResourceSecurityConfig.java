package com.higginss.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * OAuth2 Resource Server
 */
@Configuration // Marker to configure beans before the application starts.
@EnableResourceServer // Enable security filter via incoming OAuth2 token (so user passes over a token and not un/pw).
public class ResourceSecurityConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll() // Allow access to home/index page etc.
                .antMatchers("/api/v1/**").authenticated(); //Secure the REST API /api endpoint with OAuth2.
    }
}
