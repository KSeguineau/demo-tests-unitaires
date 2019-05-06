package Diginamic.demo_tests_unitaires.dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance1() {
		CharSequence a = "titi";
		CharSequence b = "toto";
		assertEquals(2, StringUtils.levenshteinDistance(a, b));
	}

	@Test
	public void testLevenShteinDistance2() {
		String a = "titi";
		String b = "toto";
		assertEquals(2, StringUtils.levenshteinDistance(a, b));
	}

	@Test
	public void testLevenShteinDistance3() {
		String a = "titi";
		String b = null;
		assertEquals(4, StringUtils.levenshteinDistance(a, b));
	}

	@Test
	public void testLevenShteinDistance4() {
		assertEquals(0, StringUtils.levenshteinDistance(null, null));
	}

	@Test
	public void testLevenShteinDistance5() {
		String a = "";
		String b = "toto";
		assertEquals(4, StringUtils.levenshteinDistance(a, b));
	}
}
