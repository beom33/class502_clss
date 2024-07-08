package config;


import exam01.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public RecCalculator recCalculator() {
        return new RecCalculator();
    }
}
