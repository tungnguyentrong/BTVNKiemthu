package ktSoNguyenTo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ktSonguyentoTest {

	@Test
	public void test() {
		ktSonguyento chekc= new ktSonguyento();
		assertEquals("La so nguyen to",7);
	}
	public void test2() {
		ktSonguyento chekc= new ktSonguyento();
		assertEquals("Ko la so nguyen to",6);
	}

	
}
