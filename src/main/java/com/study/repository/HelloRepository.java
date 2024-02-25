package com.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.Entity.HelloModel;

public interface HelloRepository extends JpaRepository<HelloModel, Long> {}
