package triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test (expected= RuntimeException.class) 
	public void tresLadosConLongitud0() {
		Triangulo t = new Triangulo(2, 1, 0);
	}

}
