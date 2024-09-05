package com.example.springtutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtutorial.entity.ToDo;
@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>{
}
