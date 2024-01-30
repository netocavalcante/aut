package com.autom.example.aut;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		plugin = {"pretty", "html:target/cucumber-reports"}
)
@SpringBootTest
@EnableJms
class AutApplicationTests {



}
