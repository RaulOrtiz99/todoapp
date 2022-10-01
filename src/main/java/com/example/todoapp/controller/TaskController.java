package com.example.todoapp.controller;

import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.service.TaskService;
import com.example.todoapp.service.dto.TaskinDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}

