package com.example.todoapp.persistence.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //ESTO ES DE LOMBOK ES PARA LOS GETTERS Y SETTERS DE ESTA ENTIDAD
@Entity // esto es para determinar que es una entidad de una bd
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private boolean finished;
    private TaskStatus taskStatus;
}
