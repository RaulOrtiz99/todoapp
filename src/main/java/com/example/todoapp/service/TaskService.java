package com.example.todoapp.service;

import com.example.todoapp.mapper.TaskInDTOToTask;
import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.persistence.entity.TaskStatus;
import com.example.todoapp.persistence.repository.TaskRepository;
import com.example.todoapp.service.dto.TaskinDTO;
import com.sun.source.util.TaskListener;
import org.springframework.stereotype.Service;

import java.util.List;

//Todo: esta clase es para toda la logica de negocio de la app en este caso el poder crear tareas y demas

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;


    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    //para guardar datos en spring usando JPA se usa el repository
    public Task createTask(TaskinDTO taskinDTO){
        Task task= mapper.map(taskinDTO);//aca se esta mapeando y convirtiendo el DTO a un task comun
        return this.repository.save(task);//aca guardamos la tarea en el repositorio

    }

    public List<Task> findAll(){//esto es par que nos devuelva la lista de tareas
        return this.repository.findAll();
    }


    public List<Task> findAllByTaskStatus(TaskStatus status){
        return this.repository.findAllByTaskStatus(status);
    }






}
