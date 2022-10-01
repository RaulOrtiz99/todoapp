package com.example.todoapp.service.dto;



import lombok.Data;

import java.time.LocalDateTime;

//todo: el Dto le pedira el usuario se necesitara para crear una tarea

@Data
public class TaskinDTO {

    private String title;
    private String description;
    private LocalDateTime eta;
}
