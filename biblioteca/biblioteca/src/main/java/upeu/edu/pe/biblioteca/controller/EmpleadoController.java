package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.entity.Empleado;
import upeu.edu.pe.biblioteca.service.EmpleadoService;




@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return empleadoService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Empleado empleado){
	 return empleadoService.create(empleado);	
	}
	
}
