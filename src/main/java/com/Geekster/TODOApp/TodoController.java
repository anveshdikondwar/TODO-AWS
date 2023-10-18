package com.Geekster.TODOApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    List<Todo> todoList;

    //Creating todos post APIs

    //add a todo
    @PostMapping("todo")
    public String addTodo(@RequestBody Todo myTodo){  // @RequestBody to tell it that ok pzl look for this object myTodo in the http request body

        todoList.add(myTodo);
        return "todo added";
    }

    //get api
    //get all todo:
    @GetMapping("todos")
    public List<Todo> getAllTodos(){
        return todoList;
    }

}
