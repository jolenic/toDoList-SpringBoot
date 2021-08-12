package com.learning.toDoList.controller;

import com.learning.toDoList.model.ToDoItem;
import com.learning.toDoList.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

//@RestController
//@RequestMapping("/todo")
@Controller
public class ToDoController {

    @Autowired
    private ToDoRepo toDoRepo;

    @GetMapping("/todos")
    String getToDos(Model model) {
        model.addAttribute("toDos", toDoRepo.findAll());
        return "todos";
    }


    @PostMapping("/todos")
    public ToDoItem save(@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @PutMapping("/todos")
    public ToDoItem update(@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @DeleteMapping(value = "/todos/{id}")
    public void delete(@PathVariable Long id){
        toDoRepo.deleteById(id);
    }
}
