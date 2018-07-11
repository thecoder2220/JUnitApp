package junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Security;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class JunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(junit.JunitApplication.class, args);
        Security.setProperty("networkaddress.cache.ttl", "60");
    }

}
