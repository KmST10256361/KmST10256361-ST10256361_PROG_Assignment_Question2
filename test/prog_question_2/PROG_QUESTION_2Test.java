/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_question_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karan
 */
public class PROG_QUESTION_2Test {
    
    public PROG_QUESTION_2Test() {
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
     * Test of main method, of class PROG_QUESTION_2.
     */
   

    /**
     * Test of digitcheck method, of class PROG_QUESTION_2.
     */
    @Test
    public void testDigitcheck() {
        System.out.println("digitcheck");
        String num = "123";
        PROG_QUESTION_2 instance = new PROG_QUESTION_2();
        boolean expResult = true;
        boolean result = instance.digitcheck(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
     @Test
    public void testDigitcheckinvalid() {
        System.out.println("digitcheck");
        String num = "asd23";
        PROG_QUESTION_2 instance = new PROG_QUESTION_2();
        boolean expResult = false;
        boolean result = instance.digitcheck(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
