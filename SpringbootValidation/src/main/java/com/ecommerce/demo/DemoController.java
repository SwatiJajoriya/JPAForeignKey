
package com.ecommerce.demo;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
Logger log=Logger.getAnonymousLogger();
	@PostMapping("/demo")
	public String requestGot(@RequestParam("email") String email,@RequestParam("password") String password) {
		log.info(email +"  "+password);
		return "success";
	}
	
}


