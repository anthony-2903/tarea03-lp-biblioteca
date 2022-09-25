package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Cliente;
@Component
public class ClienteDaoImpl implements Operaciones<Cliente>{
@Autowired
	private JdbcTemplate  jdbcTemplace;  
	@Override
	public int create(Cliente t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO 	clientes (idcliente, nombres, apellidos, direccion) values("
				+ " 0, ?, ?,?)";
		return jdbcTemplace.update(SQL, t.getNombre(), t.getApellido(), t.getDireccion());
	}

	@Override
	public int update(Cliente t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> reAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "SELECT * FROM biblioteca.clientes";
		return jdbcTemplace.queryForList(SQL);
	}



}
