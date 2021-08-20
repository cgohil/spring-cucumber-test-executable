package com.test.cucumber.steps;

import io.cucumber.java.en.When;

public class KafkaSteps extends Step {

    @When("^booking event pushed to kafka$")
    public void bookingEventPushed() {
        System.out.println("Booking Event Pushed");
    }
}
