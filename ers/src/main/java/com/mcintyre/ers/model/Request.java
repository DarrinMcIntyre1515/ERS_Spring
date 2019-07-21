package com.mcintyre.ers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requests")
public class Request {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "rq_Id", unique = true, nullable = false)
	private int id;
	
	
	@Column(name = "rq_requesterId", nullable = false)
	private int requesterId;
	
	@Column(name = "rq_adminId")
	private int adminId;
	
	@Column(name = "rq_balance", nullable = false)
	double balance;
	
	@Column(name = "rq_purpose", nullable = false)
	private String purpose;
	
	@Column(name = "rq_adminNote")
	private String adminNote;
	
	@Column(name = "rq_type", nullable = false)
	private String type;

	
	public Request(int id, int requesterId, int adminId, double balance, String purpose, String adminNote, String type,
			String empFn, String empLn) {
		super();
		this.id = id;
		this.requesterId = requesterId;
		this.adminId = adminId;
		this.balance = balance;
		this.purpose = purpose;
		this.adminNote = adminNote;
		this.type = type;
	}

	public Request() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(int requesterId) {
		this.requesterId = requesterId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getAdminNote() {
		return adminNote;
	}

	public void setAdminNote(String adminNote) {
		this.adminNote = adminNote;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Request [id=" + id + ", requesterId=" + requesterId + ", adminId=" + adminId + ", balance=" + balance
				+ ", purpose=" + purpose + ", adminNote=" + adminNote + ", type=" + type + "]";
	}
}
