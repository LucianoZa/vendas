package io.github.LucianoZa;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName;

    @Gato
    private Animal animal;

    @Bean
    public CommandLineRunner executarAnimal() {
        return args -> {
            this.animal.fazerbarulho();
        };
    }

    @GetMapping("/hello")
    public String helloworld() {
        return applicationName; //"Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
