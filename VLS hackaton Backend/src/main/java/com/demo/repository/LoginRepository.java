package com.demo.repository;

import com.demo.controller.LoginController;
import com.demo.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {
}
