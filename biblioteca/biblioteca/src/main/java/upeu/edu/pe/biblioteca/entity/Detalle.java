package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Detalle {
	private int iddetalle;
	private int idprestamo;
	private int idlibro;
	
}
