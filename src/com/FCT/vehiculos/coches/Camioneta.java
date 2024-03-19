package com.FCT.vehiculos.coches;

import com.FCT.vehiculos.motor.Motor;

public class Camioneta {
	private Motor motor;
	
	public Camioneta(Motor motor) {
		this.motor = motor;
	}
	
	public void arrancar(){
		motor.encender();
		System.out.println("Camioneta encendida.");
	}
}
