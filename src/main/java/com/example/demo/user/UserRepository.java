package main.java.com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

		
	
     @Query("SELECT  u from User u where u.userEmail= ?1")
     Optional <User>  loginUser(String email);
     
     @Query("SELECT  u from User u where u.userPassword= ?1")
     Optional <User>  findByPassword(String password);
     
     
     @Query("SELECT  u from User u where u.userEmail= ?1")
     Optional <User>  findUserByEmail(String email);
     

}
