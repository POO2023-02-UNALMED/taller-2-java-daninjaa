package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos; 
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
int cantidadAsientos() 
	{
		int numAsientos = 0;
		for (int i = 0 ; i < asientos.length; i++)
		{
			if (asientos[i] != null)
			{
				numAsientos++;
			}
			
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
