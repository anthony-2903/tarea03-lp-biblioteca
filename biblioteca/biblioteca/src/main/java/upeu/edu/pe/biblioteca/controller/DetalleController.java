package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.entity.Detalle;
import upeu.edu.pe.biblioteca.service.DetalleService;

@RestController
@RequestMapping("/api/detalle")
public class DetalleController  {
@Autowired
private DetalleService DetalleService;
@GetMapping("/all")
  public List<Map<String, Object>>listar(){
	return DetalleService.readAll2();
}
@PostMapping("/add")
public int guardar(@RequestBody Detalle detalle) {
	return DetalleService.create(detalle);
}
}