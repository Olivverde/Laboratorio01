import static org.junit.Assert.*;

import org.junit.Test;
// Verificando que se guarden las frecuencias en los botones
public class Test3 {

	@Test
	public void test() {
		Radio radio = new Radio();
		radio.avanzar();
		radio.guardar(1);
		String b = radio.estacionActual();
		assertEquals(b, "\nEstas sintonizando la emisora FM - 88.10000000000001\nGuardadas: 88.10000000000001 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | 0.0 | ");
	}

}
