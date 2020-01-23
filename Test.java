import static org.junit.Assert.*;

// Probando el encendido y el apagado del radio
public class Test {

	@org.junit.Test
	public void test() {
		Radio radio = new Radio();
		radio.onOff();
		boolean a = radio.estado();
		assertEquals(a, true);
	}

}
