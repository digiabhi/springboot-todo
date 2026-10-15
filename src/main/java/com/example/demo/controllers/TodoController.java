package com.example.demo.controllers;

import com.example.demo.dtos.CreateTodoDTO;
import com.example.demo.schema.Todo;
import com.example.demo.services.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo createTodo(@RequestBody CreateTodoDTO createTodoDTO){
        return todoService.createNewTodo(createTodoDTO);
    }
}
