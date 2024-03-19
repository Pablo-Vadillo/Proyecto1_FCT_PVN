package com.FCT.vehiculos.main;

import com.FCT.vehiculos.coches.Camioneta;
import com.FCT.vehiculos.motor.Motor;
import com.FCT.vehiculos.motor.MotorElectrico;
import com.FCT.vehiculos.motor.MotorGasolina;

public class Main {
	
	public static void main(String[] args) {
		
		Motor motorElectrico = new MotorElectrico();
		Camioneta camionetaElectrica = new Camioneta(motorElectrico);
		camionetaElectrica.arrancar();
		
		Motor motorGasolina = new MotorGasolina();
		Camioneta camionetaGasolina = new Camioneta(motorGasolina);
		camionetaGasolina.arrancar();
		
	}
	
	

	
	
	
	
	
	
	
	


}
