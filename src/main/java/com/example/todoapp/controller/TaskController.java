package com.example.todoapp.controller;

import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.persistence.entity.TaskStatus;
import com.example.todoapp.service.TaskService;
import com.example.todoapp.service.dto.TaskinDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Todo: La capa de controlador solo debe comunicarse con la capa de servicio
@RestController
@RequestMapping("/tasks") //TODO: este controlador gestiona las tareas
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //METODO PARA PODER CREAR UNA TAREA

    @PostMapping
    public Task creteTask(@RequestBody TaskinDTO taskinDTO){
       return this.taskService.createTask(taskinDTO);
    }

    @GetMapping
    public List<Task>findAll(){ //esto nos devuelve todas las tareas creadas
        return this.taskService.findAll();
    }

    @GetMapping("/status")
    public List<Task> findAllbyStatus(@PathVariable("status")TaskStatus status){
        return this.taskService.findAllByTaskStatus(status);
    }


}

