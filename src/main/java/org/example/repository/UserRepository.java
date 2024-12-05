package org.example.repository;

import org.example.model.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);


	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}
