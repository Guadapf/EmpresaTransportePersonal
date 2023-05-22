package ar.edu.unlam.pb2.personal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {

	@Test
	public void queSePuedanAgregarPasajeros() {
		Automovil auto1 = new Automovil("chofer1", 1.0);
		Pasajero p1 = new Pasajero();
		assertTrue(auto1.subirPasajeros(p1));
	}
	
	@Test
	public void queSePuedaAgregarKilometrosRecorridos() {
		Automovil auto1 = new Automovil("chofer1", 1.0);
		Double valorObtenido = auto1.agregarKilometros(200.0);
		Double valorEsperado = 201.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queNoSePuedanSubirMasPersonasPorExcesoDeCapacidad() {
		Automovil auto1 = new Automovil("chofer1", 1.0);
		Pasajero p1 = new Pasajero();
		Pasajero p2 = new Pasajero();
		Pasajero p3 = new Pasajero();
		Pasajero p4 = new Pasajero();
		
		assertTrue(auto1.subirPasajeros(p1));
		assertTrue(auto1.subirPasajeros(p2));
		assertTrue(auto1.subirPasajeros(p3));
		assertFalse(auto1.subirPasajeros(p4));
	}
	
	@Test
	public void verLaCantidadDeKilometrosRecorridos() {
		Automovil auto1 = new Automovil("chofer1", 1.0);
		auto1.agregarKilometros(100.0);
		auto1.agregarKilometros(150.0);
		auto1.agregarKilometros(10.0);
		Double valorEsperado = 261.0;
		assertEquals(valorEsperado, auto1.getCantidadKilometros(), 0.01);
	}

}
