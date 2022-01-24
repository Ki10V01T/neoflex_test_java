package com.neoflex.testapp.repository;

import com.neoflex.testapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


//@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {}