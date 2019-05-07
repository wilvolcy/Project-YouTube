package edu.mum.youtube.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import java.util.List;

@Entity
public class UserAccount {
	@Id
	private Integer accountId;
	
	private String userName;
	private String password;
	private String email;
	/*
	 * private String photo;
	 * 
	 * List<PlayList> listPlayList; List<Channel> listChannel; List<Subscription>
	 * listSubscription; List<Comment> listComment ;
	 */

	public UserAccount(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
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
