package edu.mum.youtube.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//import java.util.List;

@Entity
@Table(name="mytable")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int account_id;
	
	private String userName;
	private String password;
	private String email;
	@Transient
	private String temp;
	/*
	 * private String photo;
	 * 
	 * List<PlayList> listPlayList; List<Channel> listChannel; List<Subscription>
	 * listSubscription; List<Comment> listComment ;
	 */
	public UserAccount() {
		
	}
	
	
	public UserAccount(  String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		//this.accountId =accountId;
	}

	public UserAccount( int id, String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.account_id =id;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
