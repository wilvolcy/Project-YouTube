package edu.mum.youtube.services;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mum.youtube.model.UserAccount;
import edu.mum.youtube.repository.UserRepository;
 
@Service
@Transactional 
public class UserService {
	@Autowired 
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository ) {
		this.userRepository = userRepository;
	}
	

	
	public void saveMyUser(UserAccount user) {
		userRepository.save(user);
	}
}
