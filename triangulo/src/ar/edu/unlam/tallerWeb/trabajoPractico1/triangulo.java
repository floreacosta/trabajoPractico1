package ar.edu.unlam.tallerWeb.trabajoPractico1;

public class triangulo {
	private double resultado=0;
	public void perimetro(double lado1, double lado2, double lado3){
		resultado = lado1 + lado2 + lado3;
	}
	public void area(double base, double altura){
		resultado = base * altura / 2;
	}
	public double mostrar(){
		return resultado;
	}
}
