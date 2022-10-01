package com.example.todoapp.persistence.repository;

import com.example.todoapp.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
//TODO: un repositorio es para acceder a la base de datos de nuestra aplicacion

//TODO: el repositorio recibe una entidad T(en este caso Task) y el tipo de dato Long(que viene del id)
public interface TaskRepository extends JpaRepository<Task,Long> {

}
