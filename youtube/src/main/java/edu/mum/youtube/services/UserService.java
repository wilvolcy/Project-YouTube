package edu.mum.youtube.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mum.youtube.model.UserAccount;
import edu.mum.youtube.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;

	/*
	 * public UserService(UserRepository userRepository ) { this.userRepository =
	 * userRepository; }
	 */

	public void saveMyUser(UserAccount user) {

		userRepository.save(user);
	}

	public List<UserAccount> showAllUsers() {
		List<UserAccount> users = new ArrayList<>();
		List<UserAccount> listUser = new ArrayList<>();
		listUser = (List<UserAccount>) userRepository.findAll();

		for (UserAccount user : listUser) {
			
			users.add(user);
			

		}

		return users;
	}
}
