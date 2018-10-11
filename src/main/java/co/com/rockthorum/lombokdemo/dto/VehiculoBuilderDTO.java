package co.com.rockthorum.lombokdemo.dto;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@Builder
@ToString
public class VehiculoBuilderDTO {
	private int id;
	private String placa;
	// La Anotacion singular hace que se construya un metodo para adicionar un elemento a la lista
	@Singular
	private List<PropietarioBuilderDTO> propietarios;
}
