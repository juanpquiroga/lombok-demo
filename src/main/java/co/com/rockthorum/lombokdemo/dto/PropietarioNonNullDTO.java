package co.com.rockthorum.lombokdemo.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class PropietarioNonNullDTO {
	private int id;
	@NonNull
	private String nombre;
	@NonNull
	private String apellido;
	private String nombreCompleto;
	private boolean activo;	
}
