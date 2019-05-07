package edu.mum.youtube.repository;

//import org.aspectj.apache.bcel.util.ClassLoaderRepository;
import org.springframework.data.repository.CrudRepository;

import edu.mum.youtube.model.UserAccount;
public interface UserRepository extends CrudRepository <UserAccount, Integer>{

}
 