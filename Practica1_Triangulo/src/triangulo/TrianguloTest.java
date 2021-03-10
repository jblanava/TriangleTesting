package triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

import triangulo.Triangulo.TipoDeTriangulo;

public class TrianguloTest {

	
	// Excepcion cuando se meten valores de tipos erroneos
	
	
	@Test (expected= RuntimeException.class) 
	public void valoresErroneosConDouble() {
		Triangulo t = new Triangulo((int) 1.1,(int) 2.2, (int) 3.3);
	}
	
	@Test (expected= RuntimeException.class) 
	public void valoresErroneosConString() {
		Triangulo t = new Triangulo(Integer.parseInt("hey"),Integer.parseInt("hey"), Integer.parseInt("hey"));
	}
	
	@Test (expected= RuntimeException.class) 
	public void valoresErroneosConChar() {
		Triangulo t = new Triangulo(Integer.parseInt(String.valueOf('a')),Integer.parseInt(String.valueOf('b')), Integer.parseInt(String.valueOf('c')));
	}
	
	@Test (expected= RuntimeException.class) 
	public void valoresErroneosConObject() {
		Triangulo t = new Triangulo((Integer) new Object(),(Integer) new Object(), (Integer) new Object());
	}
	
	@Test (expected= RuntimeException.class) 
	public void valoresErroneosConNull() {
		Triangulo t = new Triangulo((Integer) null,(Integer) null, (Integer) null);
	}
	
	
	// Es escaleno valido
	
	@Test
	public void esEscalenoValidoPermutacion1() {
		Triangulo t = new Triangulo(3,4,5);
		assertTrue(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoValidoPermutacion2() {
		Triangulo t = new Triangulo(3,5,4);
		assertTrue(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoValidoPermutacion3() {
		Triangulo t = new Triangulo(4,5,3);
		assertTrue(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoValidoPermutacion4() {
		Triangulo t = new Triangulo(4,3,5);
		assertTrue(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoValidoPermutacion5() {
		Triangulo t = new Triangulo(5,3,4);
		assertTrue(t.esEscaleno());
	}
	
	
	@Test
	public void esEscalenoValidoPermutacion6() {
		Triangulo t = new Triangulo(5,4,3);
		assertTrue(t.esEscaleno());
	}
	
	
	
	// Es escaleno no valido
	
	@Test
	public void esEscalenoNoValidoConUnTrianguloEquilatero() {
		Triangulo t = new Triangulo(1,1,1);
		assertFalse(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoNoValidoConUnTrianguloIsoscelesPermutacion1() {
		Triangulo t = new Triangulo(2,2,1);
		assertFalse(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoNoValidoConUnTrianguloIsoscelesPermutacion2() {
		Triangulo t = new Triangulo(2,1,2);
		assertFalse(t.esEscaleno());
	}
	
	@Test
	public void esEscalenoNoValidoConUnTrianguloIsoscelesPermutacion3() {
		Triangulo t = new Triangulo(1,2,2);
		assertFalse(t.esEscaleno());
	}
	
	
	// Es isosceles valido
	
	@Test
	public void esIsoscelesValidoPermutacion1() {
		Triangulo t = new Triangulo(1,2,2);
		assertTrue(t.esIsosceles());
	}
	
	@Test
	public void esIsoscelesValidoPermutacion2() {
		Triangulo t = new Triangulo(2,1,2);
		assertTrue(t.esIsosceles());
	}
	
	@Test
	public void esIsoscelesValidoPermutacion3() {
		Triangulo t = new Triangulo(2,2,1);
		assertTrue(t.esIsosceles());
	}
	
	// Es isosceles no valido
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEquilatero() {
		Triangulo t = new Triangulo(1,1,1);
		assertFalse(t.esIsosceles());
	}
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEscalenoPermutacion1() {
		Triangulo t = new Triangulo(3,4,5);
		assertFalse(t.esIsosceles());
	}
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEscalenoPermutacion2() {
		Triangulo t = new Triangulo(3,5,4);
		assertFalse(t.esIsosceles());
	}
	
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEscalenoPermutacion3() {
		Triangulo t = new Triangulo(4,5,3);
		assertFalse(t.esIsosceles());
	}
	
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEscalenoPermutacion4() {
		Triangulo t = new Triangulo(4,3,5);
		assertFalse(t.esIsosceles());
	}
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEscalenoPermutacion5() {
		Triangulo t = new Triangulo(5,3,4);
		assertFalse(t.esIsosceles());
	}
	
	
	@Test
	public void esIsoscelesNoValidoConUnTrianguloEscalenoPermutacion6() {
		Triangulo t = new Triangulo(5,4,3);
		assertFalse(t.esIsosceles());
	}
	
	
	
	/*
	@Test (expected= RuntimeException.class) 
	public void numeroDeParametrosMayor3() {
		Triangulo t = new Triangulo(1,2,3,5);
	}
	*/
	
	
	// Excepcion cuando suma de lados menor que el lado restante
	 
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosMenorQueElLadoRestante1() {
		Triangulo t = new Triangulo(1,2,4);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosMenorQueElLadoRestante2() {
		Triangulo t = new Triangulo(1,4,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosMenorQueElLadoRestante3() {
		Triangulo t = new Triangulo(2,1,4);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosMenorQueElLadoRestante4() {
		Triangulo t = new Triangulo(2,4,1);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosMenorQueElLadoRestante5() {
		Triangulo t = new Triangulo(4,1,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosMenorQueElLadoRestante6() {
		Triangulo t = new Triangulo(4,2,1);
	}
	
	
	// Excepcion cuando suma de lados igual que el lado restante
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosIgualQueElLadoRestante1() {
		Triangulo t = new Triangulo(1,2,3);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosIgualQueElLadoRestante2() {
		Triangulo t = new Triangulo(1,3,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosIgualQueElLadoRestante3() {
		Triangulo t = new Triangulo(2,1,3);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosIgualQueElLadoRestante4() {
		Triangulo t = new Triangulo(2,3,1);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosIgualQueElLadoRestante5() {
		Triangulo t = new Triangulo(3,1,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void ExcepcionSumaDeLadosIgualQueElLadoRestante6() {
		Triangulo t = new Triangulo(3,2,1);
	}
	
	
	// Excepcion cuando hay algun lado negativo
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion1() {
		Triangulo t = new Triangulo(-1,2,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion1y2() {
		Triangulo t = new Triangulo(-1,-2,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion1y3() {
		Triangulo t = new Triangulo(-1,2,-2);
	}
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion1y2y3() {
		Triangulo t = new Triangulo(-1,-2,-2);
	}
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion2() {
		Triangulo t = new Triangulo(1,-2,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion2y3() {
		Triangulo t = new Triangulo(1,-2,-2);
	}
	
	@Test (expected = RuntimeException.class)
	public void NegativoEnLaPosicion3() {
		Triangulo t = new Triangulo(1,2,-2);
	}
	
	
	// Excepcion cuando hay algun lado con cero
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion1() {
		Triangulo t = new Triangulo(0,2,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion1y2() {
		Triangulo t = new Triangulo(0,0,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion1y3() {
		Triangulo t = new Triangulo(0,2,0);
	}
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion1y2y3() {
		Triangulo t = new Triangulo(0,0,0);
	}
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion2() {
		Triangulo t = new Triangulo(1,0,2);
	}
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion2y3() {
		Triangulo t = new Triangulo(1,0,0);
	}
	
	@Test (expected = RuntimeException.class)
	public void CeroEnLaPosicion3() {
		Triangulo t = new Triangulo(1,2,0);
	}
	
	
	/*
	 	Excepcion cuando se crear triangulo
		con metodo estático con mal formato de entrado
	*/
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada1() {
		Triangulo t;
		t=Triangulo.creaTriangulo("111");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada2() {
		Triangulo t;
		t=Triangulo.creaTriangulo("1 11");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada3() {
		Triangulo t;
		t=Triangulo.creaTriangulo("11 1");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada4() {
		Triangulo t;
		t=Triangulo.creaTriangulo("1%11");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada5() {
		Triangulo t;
		t=Triangulo.creaTriangulo("% % %");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada6() {
		Triangulo t;
		t=Triangulo.creaTriangulo("1 % %");
	}
	
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada7() {
		Triangulo t;
		t=Triangulo.creaTriangulo("% 1 %");
	}
	

	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada8() {
		Triangulo t;
		t=Triangulo.creaTriangulo("% % 1");
	}
	
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada9() {
		Triangulo t;
		t=Triangulo.creaTriangulo("1 1 1 1");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada10() {
		Triangulo t;
		t=Triangulo.creaTriangulo("");
	}
	
	@Test (expected = RuntimeException.class)
	public void creaTrianguloConMalFormatoDeEntrada11() {
		Triangulo t;
		t=Triangulo.creaTriangulo(null);
	}

	// Metodo tipo de triangulo devuelve Escaleno para un triangulo escaleno
	@Test 
    public void EscalenoDevuelveTipoEscaleno() {
        Triangulo t = new Triangulo(3,4,5);
        assertTrue(t.tipo() == TipoDeTriangulo.Escaleno );
    }

    @Test 
    public void EscalenoNoDevuelveTipoIsosceles() {
        Triangulo t = new Triangulo(3,4,5);
        assertTrue(t.tipo() != TipoDeTriangulo.Isosceles );
    }

    @Test 
    public void EscalenoNoDevuelveTipoEquilatero() {
        Triangulo t = new Triangulo(3,4,5);
        assertTrue(t.tipo() != TipoDeTriangulo.Equilatero );
    }



    @Test 
    public void EquilateroDevuelveTipoEquilatero() {
        Triangulo t = new Triangulo(1,1,1);
        assertTrue(t.tipo() == TipoDeTriangulo.Equilatero );
    }

    @Test 
    public void EquilateroNoDevuelveTipoIsosceles() {
        Triangulo t = new Triangulo(1,1,1);
        assertTrue(t.tipo() != TipoDeTriangulo.Isosceles );
    }

    @Test 
    public void EscalenoNoDevuelveTipoEscaleno() {
        Triangulo t = new Triangulo(1,1,1);
        assertTrue(t.tipo() != TipoDeTriangulo.Escaleno );
    }





    @Test 
    public void IsoscelesDevuelveTipoIsosceles() {
        Triangulo t = new Triangulo(1,2,2);
        assertTrue(t.tipo() == TipoDeTriangulo.Isosceles );
    }

    @Test 
    public void IsoscelesNoDevuelveTipoEquilatero() {
        Triangulo t = new Triangulo(1,2,2);
        assertTrue(t.tipo() != TipoDeTriangulo.Equilatero );
    }

    @Test 
    public void IsoscelesDevuelveTipoEscaleno() {
        Triangulo t = new Triangulo(1,2,2);
        assertTrue(t.tipo() != TipoDeTriangulo.Escaleno );
    }

}
