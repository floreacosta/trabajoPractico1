package ar.edu.unlam.tallerweb.rectangulo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RectanguloTest {

	@Test
	public void testQuePruebeElPerimetro() {
		Rectangulo perimetroDePrueba = new Rectangulo();
		Integer ladoA = 2;
		Integer ladoB = 4;
		Integer resultadoEsperado = 12;
		
		perimetroDePrueba.perimetro(ladoA, ladoB);
		Integer resultadoPerimetro = perimetroDePrueba.mostrarPerimetro();

		Assert.assertEquals(resultadoEsperado, resultadoPerimetro);
		perimetroDePrueba = null;
	}

	@Test
	public void testQuePruebeElArea() {
		Rectangulo areaDePrueba = new Rectangulo();
		Integer ladoA = 2;
		Integer ladoB = 4;
		Integer resultadoEsperado = 8;
		
		areaDePrueba.area(ladoA, ladoB);
		Integer resultadoArea = areaDePrueba.mostrarArea();

		Assert.assertEquals(resultadoEsperado, resultadoArea);
		areaDePrueba = null;
	}
	
}
