package co.com.rockthorum.lombokdemo.dto;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PropietarioBuilderDTO {
	private int id;
	private String nombre;
	private String apellido;
}
