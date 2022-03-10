package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.User;

/**
 * @author dynob - tjmendenhall2@dmacc.edu
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
