package com.bolsadeideas.springboot.examplewebservice.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.examplewebservice.app.enty.Empleado;
import com.bolsadeideas.springboot.examplewebservice.app.repo.EmpledoRepo;


@Service
public class EmpleadoService{
	
	@Autowired
	private EmpledoRepo empleadorepo;
	
	
	
	//	Metododos
	public Empleado insertar(Empleado emp) {
		return empleadorepo.save(emp);
	}
	
	public Empleado actualizar(Empleado emp) {
		return empleadorepo.save(emp);
	}

	//	Listando los datos de Empleado
	public List<Empleado> listar(){
		return empleadorepo.findAll();
	}
	
	public void eliminar(Empleado emp) {
		empleadorepo.delete(emp);
	}
	
	
	
}