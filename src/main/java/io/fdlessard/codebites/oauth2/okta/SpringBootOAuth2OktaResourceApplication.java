package io.fdlessard.codebites.oauth2.okta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


@SpringBootApplication

@EnableOAuth2Sso
public class SpringBootOAuth2OktaResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOAuth2OktaResourceApplication.class, args);
    }

}
