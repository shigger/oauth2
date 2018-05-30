package com.higginss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot developers recommend to locate your main application class in a root package above other classes. Using a
 * root package also allows the @ComponentScan annotation to be used.
 */
@SpringBootApplication
//@EnableOAuth2Sso // SSO marking service as a OAuth 2 Client responsible for directing requests to Auth Server (commented out as using OAuth2).
public class Oauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class, args);
    }
}
