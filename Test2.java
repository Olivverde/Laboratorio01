import static org.junit.Assert.*;

import org.junit.Test;
// Verificando que se pueda cambiar de meisora 
public class Test2 {

	@Test
	public void test() {
		Radio radio = new Radio();
		radio.cambiarFrecuencia();
		String b = radio.estacionActual();
		assertEquals(b, "\nEstas sintonizando la emisora AM - 530\nGuardadas: 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | ");
	}

}
