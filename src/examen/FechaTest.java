package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void CP1() {
		assertEquals(Fecha.validarFecha(0, 0, 0),false);
	}

	@Test
	void CP2() {
		assertEquals(Fecha.validarFecha(2023, 1, 32),false);
	}
	
	@Test
	void CP3() {
		assertEquals(Fecha.validarFecha(2023, 6, 30),true);
	}
	
	@Test
	void CP4() {
		assertEquals(Fecha.validarFecha(2023, 7, 31),true);
	}
}
