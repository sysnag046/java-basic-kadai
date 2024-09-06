package com.example.springkadaitodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springkadaitodo.entity.ToDo;
@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>{
}
