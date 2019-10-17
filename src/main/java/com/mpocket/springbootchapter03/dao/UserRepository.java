package com.mpocket.springbootchapter03.dao;

import com.mpocket.springbootchapter03.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
