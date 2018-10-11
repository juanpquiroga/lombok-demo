package co.com.rockthorum.lombokdemo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(exclude= {"activo","nombreCompleto"})
@ToString(exclude= {"activo","nombreCompleto"})
public class PropietarioExcludeDTO {
	private int id;
	private String nombre;
	private String apellido;
	private String nombreCompleto;
	private boolean activo;	
}
