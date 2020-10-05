package tech.adarshbp.ClientController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import tech.adarshbp.model.LoggingData;


@Controller
public class socketcontroller {


    @MessageMapping("/user")
    @SendTo("/topic/user")
    public LoggingData getMessage(LoggingData logs)
    {
        System.out.println("this is called");
        return logs;
    }



}
