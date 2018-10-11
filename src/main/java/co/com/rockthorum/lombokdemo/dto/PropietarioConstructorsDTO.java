package co.com.rockthorum.lombokdemo.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class PropietarioConstructorsDTO {
	private int id;
	@NonNull
	private String nombre;
	@NonNull
	private String apellido;
	private String nombreCompleto;
	private boolean activo;
	
}
