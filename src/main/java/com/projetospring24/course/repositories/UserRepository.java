package com.projetospring24.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring24.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
