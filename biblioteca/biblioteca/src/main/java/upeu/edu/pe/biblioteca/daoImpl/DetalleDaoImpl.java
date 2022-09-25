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
@Component
public class DetalleDaoImpl  implements Operaciones<Detalle>{
@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		String SQL =  "INSERT INTO detalle_prestamo (iddetalle, idprestamo, idlibro) VALUES(0, ?, ?)";
		return jdbcTemplate.update(SQL, t.getIdprestamo(), t.getIdlibro());
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		String SQL="UPDATE detalle WHERE(iddetalle=?)";
		return jdbcTemplate.update(SQL, t.getIddetalle());
		
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM detalle WHERE iddetalle = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		try {
		Detalle Det = jdbcTemplate.queryForObject("SELECT * FROM detalle WHERE iddetalle=?",
			    BeanPropertyRowMapper.newInstance(Detalle.class), id);
				return Det;
				}catch(IncorrectResultSizeDataAccessException e){
					return null;
	}
		}

	@Override
	public List<Detalle> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM detalle",
				BeanPropertyRowMapper.newInstance(Detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select dp.iddetalle, dp.idprestamos, l.idlibro, l.titulo, l.autor from detalle_prestamo as dp "
				+ "inner join libros as l on dp.idlibro= l.idlibro "
				+ "inner join prestamos as p on dp.idprestamos= p.idprestamos";
		return jdbcTemplate.queryForList(SQL);
	}

}
