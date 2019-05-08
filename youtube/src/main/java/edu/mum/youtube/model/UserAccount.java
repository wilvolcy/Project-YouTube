package edu.mum.youtube.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import java.util.List;

@Entity
@Table(name = "user_account")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;

	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String email;
	
	private String profileImageUrl;
	
//	@OneToMany(mappedBy = "user_account",cascade = CascadeType.REMOVE,orphanRemoval = true)
//	@JsonManagedReference(value = "user_account_playlist")
//	List<PlayList> playLists;
	
//	@OneToMany(mappedBy = "user_account",cascade = CascadeType.REMOVE,orphanRemoval = true)
//	@JsonManagedReference()
//	List<Channel>  channels;
	
//	@OneToMany(mappedBy = "user_account",cascade = CascadeType.REMOVE,orphanRemoval = true)
//	@JsonManagedReference()
//	List<Subscription> subscriptions;
	
	@OneToMany(mappedBy = "user_account",cascade = CascadeType.REMOVE,orphanRemoval = true)
	@JsonManagedReference()
	List<Comment> comments;

	public UserAccount() {

	}
	
	
	

	public UserAccount(String userName, String password, String email, String profileImageUrl, List<PlayList> playLists,
			List<Channel> channel, List<Subscription> subscriptions, List<CommentTest> comments) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.profileImageUrl = profileImageUrl;
		//this.playLists = playLists;
//		this.channels = channel;
//		this.subscriptions = subscriptions;
//		this.comments = comments;
	}




	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

//	public List<PlayList> getPlayLists() {
//	return playLists;
//	}
//
//	public void setPlayLists(List<PlayList> playLists) {
//	this.playLists = playLists;
//	}

//	public List<Channel> getChannel() {
//		return channels;
//	}
//
//	public void setChannel(List<Channel> channel) {
//		this.channels = channel;
//	}
//
//	public List<Subscription> getSubscriptions() {
//		return subscriptions;
//	}
//
//	public void setSubscriptions(List<Subscription> subscriptions) {
//		this.subscriptions = subscriptions;
//	}
//
//	public List<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}




//	@Override
//	public String toString() {
//		return "UserAccount [accountId=" + accountId + ", userName=" + userName + ", password=" + password + ", email="
//				+ email + ", profileImageUrl=" + profileImageUrl + ", playLists=" + playLists + ", channel=" + channels
//				+ ", subscriptions=" + subscriptions + ", comments=" + comments + "]";
//	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (accountId != other.accountId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	 
	 
}
