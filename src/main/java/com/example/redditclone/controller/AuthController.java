package com.example.redditclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redditclone.dto.RegisterRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	
	@PostMapping("/signup")
	private void signUp(@RequestBody RegisterRequest registerRequest) {
		// TODO Auto-generated method stub

	}
}
