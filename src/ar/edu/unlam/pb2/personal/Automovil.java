package ar.edu.unlam.pb2.personal;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
	
	public Automovil(String chofer, Double cantidadKilometros) {
		super(chofer, cantidadKilometros);
	}
	
	public Boolean subirPasajeros(Pasajero pasajero) {
		
		if(pasajeros.size() < 3) {
			return pasajeros.add(pasajero);
		}
		return false;
	}

}
