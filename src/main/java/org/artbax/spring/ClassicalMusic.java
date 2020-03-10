package org.artbax.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Initializ");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "Mozart song 10";
    }
}