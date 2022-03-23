package calculadora;

public class CalculadoraTest {
	private Calculadora c;
	
	@BeforeEach
	public void setup() {
c = new Calculadora();
	}
	
	@Test
	public void deveRetornarASomaDosNumeros() {	
		double resultado = c.somar(10, 20);
		
		assertEquals(30, resultado);
	}
	
	@Test
	public void deveRetornarASubtracaoDosNumeros() {
		double resultado = c.subtrair(20,10);
		
		assertEquals(10, resultado);
	}
	@Test
	public void deveRetornarDivisaoDosNumeros() {

	double resultado = c.divisao(3, 3);

	if (resultado != 0) {
	assertEquals(1, resultado);
	}
	}
	
