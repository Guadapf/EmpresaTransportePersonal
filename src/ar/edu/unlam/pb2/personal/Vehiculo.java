package ar.edu.unlam.pb2.personal;

import java.util.ArrayList;

public abstract class Vehiculo {
	
	private String chofer;
	private Double cantidadKilometros;
	
	protected ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	
	public Vehiculo(String chofer, Double cantidadKilometros) {
		this.chofer = chofer;
		this.cantidadKilometros = cantidadKilometros;
	}

	public String getChofer() {
		return chofer;
	}
	
	public Boolean setChofer(String chofer) {
		Boolean fueExitoso = false;
		if(pasajeros.isEmpty()) {
			this.chofer = chofer;
			return fueExitoso = true;
		}
		return fueExitoso;
	}

	public Double getCantidadKilometros() {
		return cantidadKilometros;
	}
	
	public Double agregarKilometros(Double kilometros) {
		return this.cantidadKilometros += kilometros;
	}
	
	public abstract Boolean subirPasajeros(Pasajero pasajero);
	
	public Boolean quitarPasajero(Pasajero pasajero) {
		return pasajeros.remove(pasajero);
	}
	
	public Boolean hayPasajeros() {
		return pasajeros.isEmpty();
	}
	

}
