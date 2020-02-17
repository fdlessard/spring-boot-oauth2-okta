package io.fdlessard.codebites.oauth2.okta;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringBootOAuth2OktaResourceApplication {

  @GetMapping("/")
  public String welcome2User(Principal principal) {
    return "Hi " + principal.getName() + " Welcome";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootOAuth2OktaResourceApplication.class, args);
  }

}
