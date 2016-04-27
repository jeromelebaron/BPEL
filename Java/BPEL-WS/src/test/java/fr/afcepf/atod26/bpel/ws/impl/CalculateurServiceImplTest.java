package fr.afcepf.atod26.bpel.ws.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.afcepf.atod26.bpel.ws.api.ICalculateurService;

public class CalculateurServiceImplTest {

	private ICalculateurService calculateurService;

	@Before
	public void init() {
		calculateurService = new CalculateurServiceImpl();
	}

	@Test
	public void notNull() {
		Assert.assertNotNull(calculateurService);
	}

	@Test
	public void testAdditition() {
		Assert.assertEquals(10, calculateurService.additition(5, 5), 0.00001);
	}

	@Test
	public void testMultiplication() {
		Assert.assertEquals(100, calculateurService.multiplication(10, 10), 0.00001);
	}

}
