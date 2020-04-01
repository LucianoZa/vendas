package io.github.LucianoZa;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan() normalmente desnecessário explicitar! Necessario caso haja projeto externo.
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/hello")
    public String helloworld() {
        return applicationName; //"Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
