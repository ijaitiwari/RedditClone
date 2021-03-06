package com.example.redditclone.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long UserId;
	
	@NotBlank(message = "UserName is required")
	private String username;
	
	@NotBlank(message="password is required")
	private String password;
	
	@Email
	@NotEmpty(message = "Email is Required")
	private String email;
	
	private Instant created;
	
	private boolean enabled;
	
}
