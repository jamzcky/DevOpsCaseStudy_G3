/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JamSOCO
 */
public class MainIT {
    
    Main instance;
    public MainIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Main();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of Divide method, of class Main.
     */
    @Test
    public void testDivideNumber() {
        System.out.println("Divide Numbers ");
        String divisor = "6";
        String dividend = "3";        
        String expResult = "2.0";
        String result = instance.Divide(divisor, dividend);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
      public void testDivideInfinity() {
        System.out.println("Divide Infinity ");
        String divisor = "6";
        String dividend = "0";        
        String expResult = "Infinity"; //Division by Zero not allowed.
        String result = instance.Divide(divisor, dividend);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      @Test
      public void testDivideWithString() {
        System.out.println("Divide with String");
        String divisor = "9";
        String dividend = "a";        
        String expResult = "For input string";
        String result = instance.Divide(divisor, dividend);
        assertEquals(expResult, result.substring(0, 16));
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
