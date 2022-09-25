package upeu.edu.pe.biblioteca.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoImpl.EmpleadoDaoImpl;
import upeu.edu.pe.biblioteca.entity.Empleado;

@Service
public class EmpleadoService implements Operaciones<Empleado> {
	@Autowired
	private EmpleadoDaoImpl daoImpl;
	
	@Override
	public int create(Empleado t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Empleado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> reAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}
 
}
