package io.fdlessard.codebites.oauth2.okta;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootOAuth2OktaResourceApplication {

  @GetMapping("/")
  public String welcome2User(Principal principal) {
    return "Hi " + principal.getName() + " Welcome";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootOAuth2OktaResourceApplication.class, args);
  }

  @Configuration
  public class WebConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests().anyRequest().authenticated()
          .and().oauth2Client()
          .and().oauth2Login();
    }
  }
}
