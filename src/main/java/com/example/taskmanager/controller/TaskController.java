
package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

 @Autowired
 private TaskService service;

 @GetMapping
 public List<Task> getTasks(){
  return service.getTasks();
 }

 @PostMapping
 public Task createTask(@RequestBody Task task){
  return service.createTask(task);
 }

 @DeleteMapping("/{id}")
 public void deleteTask(@PathVariable Long id){
  service.deleteTask(id);
 }
}
