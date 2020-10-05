package tech.adarshbp.ClientController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import tech.adarshbp.model.LoggingData;


@RestController
public class loggingController {


	@Autowired
	LoggingData logging ;

	@Autowired
	SimpMessagingTemplate template;


	@RequestMapping("/")
	public String start()
	{
		return "Hi its logger service here";
	}


	@RequestMapping("/hi")
	public String testMicroService()
	{
		return "Hi its logger service here";
	}


	@PostMapping(path = "/addlogs", consumes = "application/json")
	void addLogs(@RequestBody LoggingData newLogs) {

		System.out.println("logging request received ");

		try {
			template.convertAndSend("/topic/user",newLogs);
		}catch (Exception e)
		{
			System.out.println("logging was not performed  " + e);
		}

		System.out.println("logging request completed  ");

	}

}
