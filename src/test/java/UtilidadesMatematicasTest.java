package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.curso.java.utils.UtilidadesMatematicas;

public class UtilidadesMatematicasTest {

	@Test
	public void testSumar1() {
		int resultado = UtilidadesMatematicas.sumar(2,3);
		
		assertNotEquals(-1, resultado);
	}
	
	@Test
	public void testSumar() {
		int resultado = UtilidadesMatematicas.sumar(2,3);
		
		assertEquals(5, resultado);
	}
	
	
	@Test
	public void testOperacionMultiplicacion() {
		double resultado = UtilidadesMatematicas.operacion(7, 5, "*");
		
		//assertEquals(35, resultado);
		assertEquals(35, resultado, 0);
	}
	
	@Test
	public void testOperacionDivision() {
		double resultado = UtilidadesMatematicas.operacion(10, 5, "/");
		
		//assertEquals(35, resultado);
		assertEquals(2, resultado, 0);
	}
	
}