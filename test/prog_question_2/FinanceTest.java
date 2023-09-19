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

/**
 *
 * @author karan
 */
public class FinanceTest {
    
    public FinanceTest() {
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
     * Test of ReportNameDisplay method, of class Finance.
     */
    @Test
    public void testReportNameDisplay() {
        System.out.println("ReportNameDisplay");
        Finance instance = new Finance();
        instance.ReportNameDisplay();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of BubbleSortDESC method, of class Finance.
     */
    @Test
    public void testBubbleSortDESC() {
        System.out.println("BubbleSortDESC");
        double[] Salary = {55.0,65.0,798.0,56.0,45.0};
        String[] players = {"KM","JN","SA","JAP","DF"};
        Finance instance = new Finance();
        instance.BubbleSortDESC(Salary, players);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of InsertionsortASC method, of class Finance.
     */
    @Test
    public void testInsertionsortASC() {
        System.out.println("InsertionsortASC");
      double[] Salary = {55.0,65.0,798.0,56.0,45.0};
        String[] players = {"KM","JN","SA","JAP","DF"};
        Finance instance = new Finance();
        instance.InsertionsortASC(Salary, players);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
