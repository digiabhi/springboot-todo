package com.example.demo.services;

import com.example.demo.dtos.CreateTodoDTO;
import com.example.demo.repositories.ITodoRepository;
import com.example.demo.schema.Todo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TodoService {

    private ITodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createNewTodo(CreateTodoDTO createTodoDTO) {
        Integer newTodoId = 1;

        List<Todo> todos = todoRepository.findAll();

        if(!todos.isEmpty()){
            Todo lastTodo = todos.get(todos.size() - 1);
            newTodoId = lastTodo.getId() + 1;
        }
        Todo newTodo = todoRepository.save(newTodoId, createTodoDTO.getContent());
        return newTodo;
    }
}
