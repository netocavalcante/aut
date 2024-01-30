package com.autom.example.aut.stepdefinitions;

import io.cucumber.spring.CucumberContextConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;


@CucumberContextConfiguration
@RequiredArgsConstructor
@SpringBootTest
public class SpringIntegrationTest {
    @Autowired
    protected final JmsTemplate jmsTemplate;
}