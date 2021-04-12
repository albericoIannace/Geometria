package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

	@Test
	public void testAreaTriangolo() {
		int base= 20;
		int altezza = 5;
		int valoreAtteso =50;
		int valoreCalcolato = Area.areaTriangolo(base, altezza);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

	@Test
	public void testAreaQuadrato() {
		int lato = 6;
		int valoreAtteso = 12;
		int valoreCalcolato = Area.areaQuadrato(lato);
		assertEquals(valoreAtteso, valoreCalcolato);;
	}

	@Test
	public void testAreaRombo() {
		int dMaggiore= 3;
		int dMinore=6;
		int valoreAtteso = 9;
		int valoreCalcolato = Area.areaRombo(dMaggiore, dMinore);
		assertEquals(valoreAtteso, valoreCalcolato);;
	}

}
