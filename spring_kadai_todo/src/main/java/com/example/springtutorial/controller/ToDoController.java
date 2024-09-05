package com.example.springtutorial.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springtutorial.entity.ToDo;
import com.example.springtutorial.service.ToDoService;

@Controller
public class ToDoController {
	private final ToDoService toDoService;
	
	// 依存性の注入（DI）を行う（コンストラクタインジェクション）
	public ToDoController(ToDoService ToDoService){
		this.toDoService = ToDoService;
	}
	
	@GetMapping("/todo")
	public String viewTodo(Model model) {
		
        // 最新のToDoリストを取得
        List<ToDo> ToDo = toDoService.getAllToDo();
        
     // ビューにユーザーリストを渡す
        model.addAttribute("ToDo", ToDo);
        
		return "todo.html";
	}
}
