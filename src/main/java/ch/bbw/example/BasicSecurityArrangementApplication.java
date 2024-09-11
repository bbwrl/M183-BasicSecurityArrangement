package ch.bbw.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ch.bbw.wysiwyg"})
public class BasicSecurityArrangementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicSecurityArrangementApplication.class, args);
    }

}
