package com.example.springtutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springtutorial.entity.ToDo;
import com.example.springtutorial.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository toDoRepository;

    // 依存性の注入（DI）を行う（コンストラクタインジェクション）
    public ToDoService(ToDoRepository ToDoRepository) {
        this.toDoRepository = ToDoRepository;
    }

	// ToDoの一括取得メソッド
    public List<ToDo> getAllToDo() {
        return toDoRepository.findAll();
    }
}
