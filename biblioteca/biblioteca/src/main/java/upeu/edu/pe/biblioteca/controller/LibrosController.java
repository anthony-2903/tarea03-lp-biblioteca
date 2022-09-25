package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import upeu.edu.pe.biblioteca.entity.Libros;
import upeu.edu.pe.biblioteca.service.LibrosService;


@RestController
@RequestMapping("/api/libro")
public class LibrosController {
@Autowired
private LibrosService libroService;

@GetMapping("/all")
public List<Map<String, Object>>listar(){
	return libroService.readAll2();
}
	 
	 @PostMapping("/add")
	 public int guardar(@RequestBody Libros libros){
		 return libroService.create(libros);	
}
}
