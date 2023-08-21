package test;

public class Auto {

	String modelo;
	
	int precio;
	
	Asiento [] asientos;
	
	String marca;
	
	Motor motor;
	
	int registro;
	
	static int cantidadCreados;
	
	
	
	int contarAsientos(){
	
		int contador = 0;
		
		for (int i = 0; i < this.asientos.length; i++) {
		
			if (asientos[i] != null) {
			
			contador ++;
		
			}
		
		}
		
		return contador;
		
	}
		
	
	String verificarIntegridad(){
	
		for (int i = 0; i < this.asientos.length; i++){
		
			if (this.asientos[i].registro != this.registro){
			
				return "Las piezas no son originales";
			
			}
		
		}
		
		if (this.registro != this.motor.registro){
		
			return "Las piezas no son originales";
		
		}
		
		else {
		
			return "Auto original";
		
		}
	
	}
}