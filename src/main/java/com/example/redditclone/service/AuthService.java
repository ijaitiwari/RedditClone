package com.example.redditclone.service;

import java.time.Instant;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.redditclone.dto.RegisterRequest;
import com.example.redditclone.model.User;
import com.example.redditclone.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService {

	
	private PasswordEncoder passwordEncoder;
	
	
	private UserRepository userRepository;
	
	@Transactional
	public void signUp(RegisterRequest registerRequest) {
		User user= new User();
       user.setUsername(registerRequest.getUserName());
       user.setEmail(registerRequest.getEmail());
       user.setPassword(passwordEncoder.encode(registerRequest.getEmail()));
       user.setCreated(Instant.now());
       user.setEnabled(false);
	}

 }
