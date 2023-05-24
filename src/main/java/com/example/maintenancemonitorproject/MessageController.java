package com.example.maintenancemonitorproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    @RequestMapping("/monitor/message")
    public static String sendMessage(){
        Message message = new Message();
        if (message.specificMessage.isEmpty()){
            return message.defaultMessage;
        } else {
            return message.specificMessage;
        }
    }
}
