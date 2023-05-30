package context_awareness.config;

import context_awareness.repositories.AppUserRepository;
import context_awareness.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"context_awareness.*"})
public class AppConfig {

//    @Bean
//    public UserRepository userRepository() {
//        var appUserRepository = new AppUserRepository();
//        System.out.println("From Bean method in AppConfig: " + appUserRepository);
//        return appUserRepository;
//    }
}
