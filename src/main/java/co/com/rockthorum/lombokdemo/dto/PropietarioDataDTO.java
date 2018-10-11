package co.com.rockthorum.lombokdemo.dto;

import lombok.Data;

@Data
public class PropietarioDataDTO {
	private int id;
	private String nombre;
	private String apellido;
	private String nombreCompleto;
	private boolean activo;
	
}
