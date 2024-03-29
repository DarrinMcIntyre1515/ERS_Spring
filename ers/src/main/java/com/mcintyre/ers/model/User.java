package com.mcintyre.ers.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "usr_id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "usr_rank", nullable = false)
	private int rank;	

    @Column(name = "usr_username", unique = true, nullable = false)
	private String username;
    
    @Column(name = "usr_email", unique = true, nullable = false)
    private String email;
    
    @Column(name = "usr_password", nullable = false)
    private String password;
    
    @Column(name = "usr_firstname", nullable = false)
    private String firstname;
    
    @Column(name = "usr_lastname", nullable = false)
    private String lastname;
    
    @Column(name = "usr_requests")
	private ArrayList<Request> rqs;
	
	public User(int id, String firstname, String lastname, String username, String email, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public User(int id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public User() {}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Request> getRqs() {
		return rqs;
	}

	public void setRqs(ArrayList<Request> rqs) {
		this.rqs = rqs;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", rank =" + rank + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", email=" + email + ", password=" + password + ", rqs=" + rqs + "]";
	}
}
