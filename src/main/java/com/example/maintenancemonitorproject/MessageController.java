package com.example.maintenancemonitorproject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private static Message message = new Message();

    @RequestMapping("/monitor/message")
    public static String sendMessage(){

        if (message.specificMessage.isEmpty()){
            return message.defaultMessage;
        } else {
            return message.specificMessage;
        }
    }

    @PostMapping("/monitor/message/set")
    public static void setMessage(String newMessage){
        message.specificMessage = newMessage;
    }
}
