import static org.junit.Assert.*;

import org.junit.Test;

public class DeletingAsTest {

	@Test
	public void test1() {
	    assertEquals("BAA",DeletingAs.delete("AABAA"));

	}
	@Test
	public void test2() {
		  assertEquals("CD",DeletingAs.delete("AACD"));
	}
	@Test
	public void test3() {
		  assertEquals("BCD",DeletingAs.delete("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",DeletingAs.delete("BBAA"));
	}
	@Test
	public void test5() {
	       assertEquals("BCD",DeletingAs.delete("ABCD"));
}
	@Test
	public void test6() {
		 assertEquals("",DeletingAs.delete(""));
	}
	@Test
public	void test7() {
		 assertEquals("",DeletingAs.delete("A"));
	}


}
