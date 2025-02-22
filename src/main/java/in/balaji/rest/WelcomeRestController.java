package in.balaji.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String port = env.getProperty("sever.port");
		String msg = "Welcome to Hindupur (" + port + ")";
		return msg;
	}

}
