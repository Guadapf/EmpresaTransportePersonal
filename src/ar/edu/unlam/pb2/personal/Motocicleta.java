package ar.edu.unlam.pb2.personal;

public class Motocicleta extends Vehiculo{
	
	public Motocicleta(String chofer, Double cantidadKilometros) {
		super(chofer, cantidadKilometros);
	}

	
	public Boolean subirPasajeros(Pasajero persona) {
		
		if(pasajeros.size() < 1) {
			return pasajeros.add(persona);
		}
		return false;
	}
	
}
