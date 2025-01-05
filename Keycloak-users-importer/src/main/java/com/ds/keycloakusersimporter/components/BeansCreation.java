package com.ds.keycloakusersimporter.components;

import com.ds.keycloakusersimporter.swing.Board;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class BeansCreation {

    @Bean
    public JFrame AppBeanCreation() {
        JFrame jFrame = new JFrame("App");
        jFrame.setContentPane(new Board().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        return jFrame;
    }
}
