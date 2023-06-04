package com.example.maintenancemonitorproject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private static Message message = new Message();


    @PostMapping("/monitor/message/set")
    public static void setMessage(String newMessage){
        message.specificMessage = newMessage;
    }
}
