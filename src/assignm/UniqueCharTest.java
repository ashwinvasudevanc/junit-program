package assignm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharTest {

	@Test
	public void testRandomChar()
	{
		assertEquals('e',UniqueChar.getFirstNonRepeatedChar("prakashprekash"));
	}
	@Test
	public void testNullChar()
	{
		assertEquals('\0',UniqueChar.getFirstNonRepeatedChar(""));
	}
	@Test
	public void testLastChar()
	{
		assertEquals('d',UniqueChar.getFirstNonRepeatedChar("anand"));
	}
	@Test
	public void testSpecialChar()
	{
		assertEquals('%',UniqueChar.getFirstNonRepeatedChar("@#@#%#@#@"));
	}
	@Test
	public void testSpaceChar()
	{
		assertEquals(' ',UniqueChar.getFirstNonRepeatedChar("bbb bba"));     //considers space as a value
	}
	@Test
	public void testNormalChar()
	{
		assertEquals('a',UniqueChar.getFirstNonRepeatedChar("abbc"));
	}
	@Test
	public void testNumbers()
	{
		assertEquals('1',UniqueChar.getFirstNonRepeatedChar("@#$@#$123%%"));
	}
	@Test
	public void testNumbersAlpha()
	{
		assertEquals('g',UniqueChar.getFirstNonRepeatedChar("aabcbc111fghf"));
	}
}

