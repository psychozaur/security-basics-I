package workshop.sb.security.basics.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
    Implementacja klasy konfiguracyjnej dla Spring Security

    TODO 5  AppSecurityConfig ma rozszerzać WebSecurityConfigurerAdapter

    TODO 6  W środku klasy AppSecurityConfig utwórz metodę:

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authBuilder) throws Exception {

    }

    W metodzie configureGlobal implementacja:

    użyj API wstrzykniętego parametru AuthenticationManagerBuilder do ustawienia konfiguracji:

        -autentykacja w pamięci
        -użytkownik             "user"
        -hasło                  "{noop}password"
        -rola                   "USER"

    Wyjaśnienie {noop} :
    https://stackoverflow.com/questions/46999940/spring-boot-passwordencoder-error

 */
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authBuilder) throws Exception {
        authBuilder
                .inMemoryAuthentication()
                .withUser("user")
                .password("{noop}password")
                .roles("USER");
    }
}
