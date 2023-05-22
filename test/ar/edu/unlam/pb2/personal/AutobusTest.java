package ar.edu.unlam.pb2.personal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutobusTest {

	@Test
	public void queSePuedanAgregarPasajeros() {
		Autobus a1 = new Autobus("Chofer 1", 1.0);
		Pasajero p1 = new Pasajero();
		
		assertTrue(a1.subirPasajeros(p1));
	}
	
	@Test
	public void queSePuedaQuitarUnPasajero() {
		Autobus a1 = new Autobus("Chofer 1", 1.0);
		Pasajero p1 = new Pasajero();
		a1.subirPasajeros(p1);
		assertTrue(a1.quitarPasajero(p1));
	}
	
	@Test
	public void queSePuedaAgregarKilometros() {
		Autobus a1 = new Autobus("Chofer 1", 1.0);
		
		Double valorObtenido = a1.agregarKilometros(220.0);
		Double valorEsperado = 221.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queNoHayaPasajeros() {
		Autobus a1 = new Autobus("Chofer 1", 1.0);
		
		assertTrue(a1.hayPasajeros());
	}
	
	@Test
	public void queHayaPasajeros() {
		Autobus a1 = new Autobus("Chofer 1", 1.0);
		Pasajero p1 = new Pasajero();
		a1.subirPasajeros(p1);
		assertFalse(a1.hayPasajeros());
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Autobus a1 = new Autobus("Chofer 1", 1.0);
		
		assertTrue(a1.setChofer("chofer2"));
	}
	
	@Test
	public void queNoSePuedaCambiarElChoferPorqueHayPasajeros() {
		Autobus a1 = new Autobus("Chofer1", 1.0);
		Pasajero p1 = new Pasajero();
		a1.subirPasajeros(p1);
		assertFalse(a1.setChofer("chofer"));
	}

}
