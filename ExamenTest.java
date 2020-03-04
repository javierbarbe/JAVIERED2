package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExamenTest {


	@DisplayName ("numDIgitos")
	@ParameterizedTest
	@CsvSource({"1","-1","3"})
	void testNumDigitos(long a) {
		
		assertEquals(1,Examen.numDigitos(a));
		//devolveran error los test de -1
	}

	@DisplayName ("numDigitosNegativos")
	@ParameterizedTest
	@CsvSource({"1","-1","3"})
	void testNumDigiNegativos(long a) {
		
		assertEquals(-1,Examen.numDigitos(a));
		//devolveran error los test de 1 , 3
	}
	
	@DisplayName ("numDigitosCero")
	@ParameterizedTest
	@CsvSource({"1","-1","0"})
	void testNumDigiCero(long a) {
		
		assertEquals(0,Examen.numDigitos(a));
		//devolveran error los test de 1 ,-1
	}
	
}
