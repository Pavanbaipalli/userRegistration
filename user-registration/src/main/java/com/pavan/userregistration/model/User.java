package com.pavan.userregistration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@SequenceGenerator(
	        name = "user_seq",
	        sequenceName = "user_sequence",
	        allocationSize = 1
	    )
	    @GeneratedValue(
	        strategy = GenerationType.SEQUENCE,
	        generator = "user_seq"
	    )
	private Long id;
	
	@Column(nullable =false, unique = true)
	private String username;
	
	@Column(nullable =false)
	private String password;
	
	

	public User() {
		
	}



	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
