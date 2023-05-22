package ar.edu.unlam.pb2.personal;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotocicletaTest {

	@Test
	public void queSePuedaAgregarAUnAcompaniante() {
		Motocicleta moto = new Motocicleta("chofer 1", 1.0);
		Pasajero p1 = new Pasajero();
		assertTrue(moto.subirPasajeros(p1));
	}
	
	@Test
	public void queSePuedaAgregarKilometros() {
		Motocicleta a1 = new Motocicleta("Chofer 1", 1.0);
		
		Double valorObtenido = a1.agregarKilometros(220.0);
		Double valorEsperado = 221.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

}
