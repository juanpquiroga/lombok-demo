package co.com.rockthorum.lombokdemo.dto;

import lombok.Getter;
import lombok.Setter;

public class PropietarioGetSetterAttsDTO {
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private String apellido;
	@Getter
	@Setter
	private String nombreCompleto;
	@Getter
	@Setter
	private boolean activo;
	
}
