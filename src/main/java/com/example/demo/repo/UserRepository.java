<<<<<<< Updated upstream
package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);
}
=======
package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);
}
>>>>>>> Stashed changes
