package com.example.todoapp.persistence.repository;

import com.example.todoapp.persistence.entity.Task;
import com.example.todoapp.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Entity;
import java.util.List;
//TODO: un repositorio es para acceder a la base de datos de nuestra aplicacion

//TODO: el repositorio recibe una entidad T(en este caso Task) y el tipo de dato Long(que viene del id)
public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findAllByTaskStatus(TaskStatus status);

    @Query(value = "",nativeQuery = true)
    public void markTaskAsFinished(@Param("id")Long id);
}

