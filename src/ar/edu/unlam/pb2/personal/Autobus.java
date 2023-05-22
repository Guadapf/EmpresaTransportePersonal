package ar.edu.unlam.pb2.personal;

import java.util.ArrayList;

public class Autobus extends Vehiculo{
	
	public Autobus(String chofer, Double cantidadKilometros) {
		super(chofer, cantidadKilometros);
	}

	public Boolean subirPasajeros(Pasajero pasajero) {
		
		if(pasajeros.size() <=20) {
			return pasajeros.add(pasajero);
		}
		return false;
	}

}
