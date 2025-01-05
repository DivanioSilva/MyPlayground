package com.ds.keycloakusersimporter;


import com.ds.keycloakusersimporter.swing.Board;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(App.class).headless(false).run(args);
        //Board board = new Board();
        //Board board = context.getBean(Board.class);
        EventQueue.invokeLater(() -> {
            //Board ex = context.getBean(Board.class);
            //ex.setVisible(true);
        });
    }
}
