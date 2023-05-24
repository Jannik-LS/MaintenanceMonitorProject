package com.example.maintenancemonitorproject;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;


public class MessageControllerTest {


    @Test
    public void testMessageWithEmptySpecificMessage() {
        // Arrange
        Message message = new Message();
        message.specificMessage = "";

        // Act
        String result = MessageController.sendMessage();

        // Assert
        Assert.assertEquals("Default Message", result);
    }

   /* @Test
    public void testMessageWithNonEmptySpecificMessage() {
        // Arrange
        Message message = new Message();
        message.setDefaultMessage("Default Message");
        message.setSpecificMessage("Specific Message");

        // Act
        String result = message.message();

        // Assert
        Assert.assertEquals("Specific Message", result);
    }*/
}
