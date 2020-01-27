/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class Connect4_doubleBufferedTest {
    
    public Connect4_doubleBufferedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Graphics g = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.update(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawBoard method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testDrawBoard() {
        System.out.println("drawBoard");
        Connect4_doubleBuffered.drawBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importArrowImage method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testImportArrowImage() {
        System.out.println("importArrowImage");
        Connect4_doubleBuffered.importArrowImage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeCounter method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testPlaceCounter() {
        System.out.println("placeCounter");
        int col = 0;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.placeCounter(col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColour method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        int state = 0;
        Color expResult = null;
        Color result = Connect4_doubleBuffered.getColour(state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchTurn method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testSwitchTurn() {
        System.out.println("switchTurn");
        Connect4_doubleBuffered.switchTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent evt = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.mousePressed(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseReleased method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent evt = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.mouseReleased(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent evt = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.mouseEntered(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent evt = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.mouseExited(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFocusable method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testIsFocusable() {
        System.out.println("isFocusable");
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        boolean expResult = false;
        boolean result = instance.isFocusable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClicked method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent evt = null;
        Connect4_doubleBuffered instance = new Connect4_doubleBuffered();
        instance.mouseClicked(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasWinner method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testHasWinner() {
        System.out.println("hasWinner");
        boolean expResult = false;
        boolean result = Connect4_doubleBuffered.hasWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHorizontal method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testCheckHorizontal() {
        System.out.println("checkHorizontal");
        boolean expResult = false;
        boolean result = Connect4_doubleBuffered.checkHorizontal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkVertical method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testCheckVertical() {
        System.out.println("checkVertical");
        boolean expResult = false;
        boolean result = Connect4_doubleBuffered.checkVertical();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDiagRight method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testCheckDiagRight() {
        System.out.println("checkDiagRight");
        boolean expResult = false;
        boolean result = Connect4_doubleBuffered.checkDiagRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDiagLeft method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testCheckDiagLeft() {
        System.out.println("checkDiagLeft");
        boolean expResult = false;
        boolean result = Connect4_doubleBuffered.checkDiagLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Connect4_doubleBuffered.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Connect4_doubleBuffered.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
