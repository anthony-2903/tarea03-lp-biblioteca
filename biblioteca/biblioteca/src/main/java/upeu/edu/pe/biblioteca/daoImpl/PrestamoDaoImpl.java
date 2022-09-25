package upeu.edu.pe.biblioteca.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Detalle;
import upeu.edu.pe.biblioteca.entity.Prestamo;

@Component
public class PrestamoDaoImpl implements Operaciones<Prestamo> {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		String  SQL= "INSERT INTO prestamos (idprestamos,  fecha_prestamo,  fecha_devolucion, idcliente, idempleados) "
				+ "values("+" 0, now(), ?, ?, ?)";
		return jdbcTemplate.update(SQL, t.getFecha_prestamo(), t.getFecha_devolucion (), t.getIdcliente(), t.getIdempleado());
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		String SQL="UPDATE prestamo SET fecha_prestamo = ? WHERE(idprestamo=?)";
		return jdbcTemplate.update(SQL, t.getFecha_prestamo(), t.getFecha_devolucion(), t.getIdprestamo());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM prestamos WHERE idprestamos= ?";
		return jdbcTemplate.update(SQL, id);
	
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		try {
		Prestamo Pre = jdbcTemplate.queryForObject("SELECT * FROM detalle WHERE idprestamos=?",
			    BeanPropertyRowMapper.newInstance(Prestamo.class), id);
				return Pre;
				}catch(IncorrectResultSizeDataAccessException e){
					return null;
	}
	}

	@Override
	public List<Prestamo> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM prestamos",
				BeanPropertyRowMapper.newInstance(Prestamo.class));
	
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String  SQL = "select p.idprestamos, e.username as empleado, concat(c.nombres,' ',c.apellidos) as cliente from prestamos as p "
				+ "inner join empleados as e on p.idempleados = e.idempleados "
				+ "inner join clientes as c on p.idcliente = c.idcliente";
		return jdbcTemplate.queryForList(SQL);
	}

}
