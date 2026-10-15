package com.example.demo.repositories;

import com.example.demo.schema.Todo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("inMemoryTodoRepository")
@Profile("prod")
public class InMemoryTodoRepository implements ITodoRepository {
    private List<Todo> todos = new ArrayList<>(
            Arrays.asList(
                    new Todo(1, "Buy Groceries"),
                    new Todo(2, "Clean the house"),
                    new Todo(3, "Go to the gym")
            )
    );

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Integer newTodoId, String todoContent) {
        Todo newTodo = new Todo(newTodoId, todoContent);
        todos.add(newTodo);
        return newTodo;
    }
}
