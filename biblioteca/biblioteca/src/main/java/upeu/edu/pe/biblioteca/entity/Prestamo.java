package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
	private int idprestamo;
	private int idcliente;
	private int idempleado;
	private double fecha_prestamo;
	private double fecha_devolucion;
}
