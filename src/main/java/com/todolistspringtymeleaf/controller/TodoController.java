package com.todolistspringtymeleaf.controller;
import com.todolistspringtymeleaf.entity.TodoRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TodoController {
    @GetMapping("/add-todo")  //how to display exact page , endpoin
    public String displayAddTodoPage() {
        return "add-todo";
    }

    @PostMapping("/add-todo")
    public String addTodo(TodoRequest todoRequest) {
        System.out.println(todoRequest);
        return "all-todo";
    }
}
