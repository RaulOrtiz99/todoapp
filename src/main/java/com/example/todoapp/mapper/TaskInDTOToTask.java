package com.example.todoapp.mapper;

import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.persistence.entity.TaskStatus;
import com.example.todoapp.service.dto.TaskinDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//esto es para convertir un TaskDTO a tipo Task
@Component
public class TaskInDTOToTask implements IMapper<TaskinDTO, Task>{
    @Override
    public Task map(TaskinDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
