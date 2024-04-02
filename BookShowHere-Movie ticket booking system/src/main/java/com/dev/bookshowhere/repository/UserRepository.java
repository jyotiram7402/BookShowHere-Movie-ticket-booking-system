package com.dev.bookshowhere.repository;


import com.dev.bookshowhere.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByMobile(String mobile);

	User findByName(String name);
}