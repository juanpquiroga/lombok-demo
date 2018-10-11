package co.com.rockthorum.lombokdemo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Genera getter and setters automatico, igual que el constructor de parametros requeridos, hashcode, equals y toString
 * @author juanp
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class PropietarioDataEquivalentDTO {
	private int id;
	private String nombre;
	private String apellido;
	private String nombreCompleto;
	private boolean activo;
	
}
