package ar.edu.unlam.tallerWeb.trabajoPractico1;

import org.junit.Assert;
import org.junit.Test;

public class trianguloTest {
	private double diferenciaPermitida;
<<<<<<< HEAD

=======
	@SuppressWarnings("deprecation")
>>>>>>> 9ee4bbb543d51e230da11d57ff032e8ef89470fb
	@Test
	public void areaTest() {
		triangulo miTriangulo = new triangulo();
		double resultadoEsperado= 4.5;
		miTriangulo.area(3, 3);
		double resultado = miTriangulo.mostrar();
		Assert.assertEquals(resultadoEsperado, resultado,diferenciaPermitida);
	}
	@Test
	public void perimetroTest(){
		triangulo miTriangulo = new triangulo();
		double resultadoEsperado = 12;
		miTriangulo.perimetro(4.5, 5.5, 2);
		double resultado = miTriangulo.mostrar();
<<<<<<< HEAD
		Assert.assertEquals(resultadoEsperado, resultado, diferenciaPermitida);
=======
		Assert.assertEquals(resultadoEsperado, resultadoEsperado, diferenciaPermitida);
>>>>>>> 9ee4bbb543d51e230da11d57ff032e8ef89470fb
	}
	@Test
	public void inicializadoTest(){
		triangulo miTriangulo = new triangulo();
		double resultadoEsperado = 0;
		double resultado = miTriangulo.mostrar();
		Assert.assertEquals(resultadoEsperado, resultado, diferenciaPermitida);
	}

}
