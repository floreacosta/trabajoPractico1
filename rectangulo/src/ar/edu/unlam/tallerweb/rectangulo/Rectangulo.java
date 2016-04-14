package ar.edu.unlam.tallerweb.rectangulo;

public class Rectangulo {
	Integer resultado;
	
	public void perimetro(Integer ladoA, Integer ladoB){
		resultado = (ladoA * 2) + (ladoB *2);
	}
	
	public Integer mostrarPerimetro(){
		return resultado;
	}
	
	public void area(Integer ladoA, Integer ladoB){
		resultado = (ladoA * ladoB);
	}
	
	public Integer mostrarArea(){
		return resultado;
	}

}
