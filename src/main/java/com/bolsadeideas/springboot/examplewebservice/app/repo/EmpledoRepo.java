package com.bolsadeideas.springboot.examplewebservice.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.examplewebservice.app.enty.Empleado;

@Repository
public interface EmpledoRepo extends JpaRepository<Empleado, Integer>{	
}