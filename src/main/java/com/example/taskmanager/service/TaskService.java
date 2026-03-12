
package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

 @Autowired
 private TaskRepository repository;

 public List<Task> getTasks(){
  return repository.findAll();
 }

 public Task createTask(Task task){
  return repository.save(task);
 }

 public void deleteTask(Long id){
  repository.deleteById(id);
 }
}
