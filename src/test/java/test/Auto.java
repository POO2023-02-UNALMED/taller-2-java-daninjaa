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
		for (Asiento silla : this.asientos) {
		     contador++;
		}	
		return contador;
		}
	String verificarIntegridad(Motor numMotor, Asiento numAsiento, Auto numAuto) {
		if (numMotor.registro != numAsiento.registro && numAsiento.registro != numAuto.registro) {
			return "Las piezas no son originales";
		}
		else {
			return "Auto original";
		  }
		
	}

		
	}
