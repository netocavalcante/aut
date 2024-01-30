package com.autom.example.aut.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.jms.core.JmsTemplate;

public class SimpleTest extends SpringIntegrationTest{
    public SimpleTest(JmsTemplate jmsTemplate) {
        super(jmsTemplate);
    }

    @Given("um aplicativo de exemplo está em execução")
    public void aSampleApplicationIsRunning() {
        System.out.println("O aplicativo Virando porgramdor está em execução...");
        jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello World!");
    }

    @When("eu faço um teste")
    public void iPerformATest() {
        System.out.println("Executando um teste...");
    }

    @Then("o teste deve passar")
    public void theTestShouldPass() {
        System.out.println("Teste aprovado!");
        String message = jmsTemplate.receiveAndConvert("DEV.QUEUE.1").toString();
        System.out.println(message);
    }
}
