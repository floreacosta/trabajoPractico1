package ar.edu.unlam.tallerweb.clase1;

import org.junit.Assert;
import org.junit.Test;


public class ContadorDeGanadoTest2 {

	@Test
	public void testQuePuedaContar() {
		ContadorDeGanado miContador=new ContadorDeGanado(); //preparacion
		Integer cantidadEsperada=1; //preparacion
		
		miContador.contar(); //ejecusión
		Integer cantidadObtenida=miContador.mostrarCantidad(); //comprobación
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);

		miContador=null;
	}
	
	@Test
	public void testQuePuedaProbarQueInicialiceEnCero(){
		ContadorDeGanado miContador=new ContadorDeGanado(); //preparacion
		Integer cantidadEsperada=0; //preparacion
		
		Integer cantidadObtenida=miContador.mostrarCantidad();
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);

		miContador=null;
	}
	
}
