package heavenmentiel.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorld {

	@RequestMapping(value ="", method = RequestMethod.GET)
	public String test()
	{
		return "Hello World";
	}
}
