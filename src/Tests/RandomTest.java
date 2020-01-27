package Tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import connect4.Connect4_doubleBuffered;

public class RandomTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void getColourTest() {
		
		assertEquals(Color.YELLOW , Connect4_doubleBuffered.getColour(1));
	}

}
