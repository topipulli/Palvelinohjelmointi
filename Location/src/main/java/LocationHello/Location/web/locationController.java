package LocationHello.Location.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class locationController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHelloToUser(@RequestParam(name="name", required=false, defaultValue="John Doe") String name, 
			@RequestParam(name="location", required=false, defaultValue = "Nowhere") String location) {
		
		return "Welcome to " + location + " " + name + "!!";
		
	}
	
	}


