package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libros {
	private int idlibro;
	private String titulo;
	private String autor;
	private String editorial;

}
