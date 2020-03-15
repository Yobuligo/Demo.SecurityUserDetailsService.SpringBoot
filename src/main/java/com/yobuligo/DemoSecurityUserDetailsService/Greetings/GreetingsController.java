package com.yobuligo.DemoSecurityUserDetailsService.Greetings;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping("/greetings")	
	public String greetings(final Principal principal) {
		return "Greetings to " + principal.getName();
	}
	
	@GetMapping("/userGreetings")
	@PreAuthorize("hasRole('USER')")
	public String userGreetings() {
		return "User Greetings";
	}
	
	@GetMapping("/adminGreetings")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminGreetings() {
		return "Admin Greetings";
	}
	
}
