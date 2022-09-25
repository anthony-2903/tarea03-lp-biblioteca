package upeu.edu.pe.biblioteca.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoImpl.LibrosDaoImpl;
import upeu.edu.pe.biblioteca.entity.Libros;
@Service
public class LibrosService implements Operaciones<Libros>{
@Autowired
	private LibrosDaoImpl daoImpl;
	@Override
	public int create(Libros t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Libros t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Libros read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libros> reAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
