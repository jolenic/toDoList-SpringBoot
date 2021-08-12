package com.learning.toDoList.repo;

import com.learning.toDoList.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ToDoRepo extends JpaRepository<ToDoItem, Long> {
}
