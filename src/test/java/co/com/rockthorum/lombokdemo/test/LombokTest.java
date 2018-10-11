package co.com.rockthorum.lombokdemo.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import co.com.rockthorum.lombokdemo.dto.EjemploLazy;
import co.com.rockthorum.lombokdemo.dto.LoggerDemo;
import co.com.rockthorum.lombokdemo.dto.PropietarioBuilderDTO;
import co.com.rockthorum.lombokdemo.dto.PropietarioConstructorsDTO;
import co.com.rockthorum.lombokdemo.dto.PropietarioDataDTO;
import co.com.rockthorum.lombokdemo.dto.PropietarioDataEquivalentDTO;
import co.com.rockthorum.lombokdemo.dto.PropietarioExcludeDTO;
import co.com.rockthorum.lombokdemo.dto.PropietarioGetSetterAttsDTO;
import co.com.rockthorum.lombokdemo.dto.PropietarioNonNullDTO;
import co.com.rockthorum.lombokdemo.dto.SynchronizedDemo;
import co.com.rockthorum.lombokdemo.dto.VehiculoBuilderDTO;
import lombok.Cleanup;


public class LombokTest {

	@Test
	public void dataAnnnotation() {
		PropietarioDataDTO prop = buildPropietario();
		System.out.println(prop);
		
		PropietarioDataDTO prop2 = buildPropietario2();
		
		System.out.println("Igual " + prop.equals(prop2));
		System.out.println("Hashcode prop " + prop.hashCode() + " prop2 " + prop2.hashCode() );
		prop2.setActivo(true);
		
		System.out.println("Igual " + prop.equals(prop2));
		System.out.println("Hashcode prop " + prop.hashCode() + " prop2 " + prop2.hashCode() );
	}
	
	@Test
	public void getSetAnnnotation() {
		System.out.println("Prueba de getter and setter a nivel de atributos");
		PropietarioGetSetterAttsDTO prop = buildPropietarioGetSet();
		System.out.println(prop);
		
	}
	
	@Test
	public void nonNullAnnnotation() {
		System.out.println("Prueba de setter con anotacion non nulls se produce error al intentar hacer set con null");
		PropietarioNonNullDTO prop = buildPropietarioNonNull();
		System.out.println(prop);
		
	}
	
	@Test
	public void dataEquivalentAnnnotation() {
		System.out.println("Prueba de anotaciones equivalentes a Data");
		PropietarioDataEquivalentDTO prop = buildPropietarioDataEquivalent();
		System.out.println(prop);
		
	}
	
	@Test
	public void testCleanUp() {
	    try {
	        @Cleanup ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        baos.write(new byte[] {'Y','e','s'});
	        System.out.println(baos.toString());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	@Test
	public void testSynchronized() {
		SynchronizedDemo demo = new SynchronizedDemo();
		String prueba = demo.synchronizedFormat(new Date());
		System.out.println(prueba);
	}

	@Test
	public void excludeWithAnnnotations() {
		System.out.println("Prueba de excluir campos especificos");
		PropietarioExcludeDTO prop = buildPropietarioExclude();
		System.out.println(prop);
		
	}
	
	@Test
	public void constructorsAnnnotations() {
		System.out.println("Prueba de constructores definidos sin parametros, requeridos y todos");
		
		System.out.println("Sin parametros");
		PropietarioConstructorsDTO prop = buildPropietarioConstructors();
		System.out.println(prop);
		
		System.out.println("Con parametros requeridos, los que esten con NonNull");
		PropietarioConstructorsDTO prop2 = new PropietarioConstructorsDTO("Pepe2","Rodriguez2");
		System.out.println(prop2);
		
		System.out.println("Con todos los parametros");
		PropietarioConstructorsDTO prop3 = new PropietarioConstructorsDTO(1,"Pepe3","Rodriguez3","Pepe3 Rodriguez3",true);
		System.out.println(prop3);
	}
	
	@Test
	public void builderAnnnotation() {
		System.out.println("Prueba de builder");
		
		VehiculoBuilderDTO dto = VehiculoBuilderDTO.builder().id(1).placa("AAA001")
				.propietario(PropietarioBuilderDTO.builder().id(1).nombre("Pepe").apellido("Perez").build())
				.propietario(PropietarioBuilderDTO.builder().id(2).nombre("Dora").apellido("Rodriguez").build())
				.build();
		System.out.println(dto);
	}
	
	@Test
	public void logAnnotation() {
		System.out.println("Prueba de log");
		LoggerDemo.helloLog();
	}
	
	@Test
	public void lazyAnnotation() {
		System.out.println("Prueba de lazy");
		EjemploLazy ejemploLazy = new EjemploLazy();
		System.out.println("El primer llamado lo construye");
		System.out.println(ejemploLazy.getCached());
		System.out.println("Ya se encuentra construido lo retorna unicamente");
		System.out.println(ejemploLazy.getCached());
	}
	
	private PropietarioConstructorsDTO buildPropietarioConstructors() {
		PropietarioConstructorsDTO prop = new PropietarioConstructorsDTO();
		
		prop.setId(1);
		prop.setNombre("Pepe");
		prop.setApellido("Rodriguez");
		prop.setNombreCompleto("Pepe Alberto Rodriguez");
		prop.setActivo(true);
		return prop;
	}
	
	private PropietarioExcludeDTO buildPropietarioExclude() {
		PropietarioExcludeDTO prop = new PropietarioExcludeDTO();
		
		prop.setId(1);
		prop.setNombre("Pepe");
		prop.setApellido("Rodriguez");
		prop.setNombreCompleto("Pepe Alberto Rodriguez");
		prop.setActivo(true);
		return prop;
	}
	
	private PropietarioDataEquivalentDTO buildPropietarioDataEquivalent() {
		PropietarioDataEquivalentDTO prop = new PropietarioDataEquivalentDTO();
		
		prop.setId(1);
		prop.setNombre("Pepe");
		prop.setApellido("Rodriguez");
		prop.setNombreCompleto("Pepe Alberto Rodriguez");
		prop.setActivo(true);
		return prop;
	}
	
	private PropietarioDataDTO buildPropietario2() {
		PropietarioDataDTO prop2 = new PropietarioDataDTO();
		
		prop2.setId(1);
		prop2.setNombre("Pepe");
		prop2.setApellido("Rodriguez");
		prop2.setNombreCompleto("Pepe Alberto Rodriguez");
		return prop2;
	}

	private PropietarioDataDTO buildPropietario() {
		PropietarioDataDTO prop = new PropietarioDataDTO();
		
		prop.setId(1);
		prop.setNombre("Pepe");
		prop.setApellido("Rodriguez");
		prop.setNombreCompleto("Pepe Alberto Rodriguez");
		prop.setActivo(true);
		return prop;
	}
	
	private PropietarioGetSetterAttsDTO buildPropietarioGetSet() {
		PropietarioGetSetterAttsDTO prop = new PropietarioGetSetterAttsDTO();
		
		prop.setId(1);
		prop.setNombre("Pepe");
		prop.setApellido("Rodriguez");
		prop.setNombreCompleto("Pepe Alberto Rodriguez");
		prop.setActivo(true);
		return prop;
	}
	
	private PropietarioNonNullDTO buildPropietarioNonNull() {
		PropietarioNonNullDTO prop = new PropietarioNonNullDTO();
		
		try {
			prop.setId(1);
			prop.setNombre(null);
			prop.setApellido("Rodriguez");
			prop.setNombreCompleto("Pepe Alberto Rodriguez");
			prop.setActivo(true);
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return prop;
	}
}
