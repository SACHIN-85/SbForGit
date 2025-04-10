package Sb.for_git.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String>welcome()
	{
		return ResponseEntity.ok("WelCome to Git ");
	}
	
	@GetMapping("/")
	public ResponseEntity<String> Welcome()
	{
		return ResponseEntity.ok("Thanks");
	}
}
