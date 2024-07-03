package com.educandoweb.course.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
