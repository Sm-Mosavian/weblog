package ir.sm.weblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class WeblogApplication {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123"));
        SpringApplication.run(WeblogApplication.class, args);
    }

}
