package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	int cantidadAsientos(){
		int cantidad = 0;
		for	(int i=0; i<asientos.length;i++) {
			if(asientos[i]!=null)
			cantidad=cantidad+1;
		}
		return cantidad;
	}
	String verificarIntegridad(){
		String integridad = "Auto original";
		for	(int i=0; i<asientos.length;i++) {
			if(asientos[i]!=null)
				if (registro==motor.registro && registro==asientos[i].registro )
					continue;
				else
					integridad="Las piezas no son originales";
			break;	
			}
		return integridad;
		}
	}