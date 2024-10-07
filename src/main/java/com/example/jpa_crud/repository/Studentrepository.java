package com.example.jpa_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_crud.entities.Students;

public interface Studentrepository extends JpaRepository<Students, Integer>{



}
