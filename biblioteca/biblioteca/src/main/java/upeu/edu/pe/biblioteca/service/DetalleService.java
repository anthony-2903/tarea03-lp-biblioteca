package upeu.edu.pe.biblioteca.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoImpl.DetalleDaoImpl;
import upeu.edu.pe.biblioteca.entity.Detalle;
@Service
public class DetalleService implements Operaciones<Detalle> {
@Autowired
private DetalleDaoImpl daoImpl;
	
@Override
	
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		return daoImpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoImpl.delete(id);
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		return daoImpl.read(id);
	}

	@Override
	public List<Detalle> reAll() {
		// TODO Auto-generated method stub
		return daoImpl.reAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

}
