package com.projetosecreto.userdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetosecreto.userdata.model.User;
@Repository
public interface UserRepository extends JpaRepository<User ,Long> {

}
