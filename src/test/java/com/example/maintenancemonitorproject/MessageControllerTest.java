package com.example.maintenancemonitorproject;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MessageControllerTest {

    @Test
    public void testReset(){
        // Arrange
        String defaultMessage = "Everything operates as expected";

        // Act
        MessageController.resetMessage();
        String result = MessageController.sendMessage();

        // Assert
        Assert.assertEquals(defaultMessage, result);
    }


    @Test
    public void testMessageWithEmptySpecificMessage() {
        // Arrange
        String defaultMessage = "Everything operates as expected";
        String specificMessage = "";                        //Set to default
        MessageController.setMessage(specificMessage);      //Set to default

        // Act
        String result = MessageController.sendMessage();

        // Assert
        org.junit.Assert.assertEquals(defaultMessage, result);
    }

    @Test
    public void testMessageWithSpecificMessage() {
        // Arrange
        String defaultMessage = "Everything operates as expected";
        String specificMessage = "Everything operates correct";
        MessageController.setMessage(specificMessage);

        // Act
        String result = MessageController.sendMessage();

        // Assert
        Assert.assertNotSame(defaultMessage, result);
        Assert.assertEquals(specificMessage,result );
    }
}
