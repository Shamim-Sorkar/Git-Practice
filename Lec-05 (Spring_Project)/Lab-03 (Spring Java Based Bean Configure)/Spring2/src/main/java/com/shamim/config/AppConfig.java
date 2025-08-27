package com.shamim.config;

import com.shamim.Alien;
import com.shamim.Computer;
import com.shamim.Desktop;
import com.shamim.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.shamim")
public class AppConfig {


//    @Bean
//    public Alien alien(Computer comp) {
//        Alien obj = new Alien();
//        obj.setName("Alien");
//        obj.setComp(comp);
//        return obj;
//    }
//
//    @Bean
//    public Computer laptop() {
//        return new Laptop();
//    }
//
//    @Bean
//    @Primary
//    public Computer desktop() {
//        return new Desktop();
//    }
}
