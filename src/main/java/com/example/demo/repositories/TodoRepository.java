package com.example.demo.repositories;

import com.example.demo.schema.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class TodoRepository {
    private List<Todo> todos = new ArrayList<>(
            Arrays.asList(
                    new Todo("1", "Buy Groceries"),
                    new Todo("2", "Clean the house"),
                    new Todo("3", "Go to the gym")
            )
    );

    public List<Todo> findAll() {
        return todos;
    }
}
