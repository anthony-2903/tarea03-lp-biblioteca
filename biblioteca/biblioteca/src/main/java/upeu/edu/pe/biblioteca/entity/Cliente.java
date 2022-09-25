package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Cliente {
	private int idcliente;
	private String nombre;
	private String apellido;
	private String direccion;
	
}
