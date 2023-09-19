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



public class Hockey_TEAMTest {
    
    
    public Hockey_TEAMTest() {
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
     * Test of setTeamNum method, of class Hockey_TEAM.
     */
    @Test
    public void testSetTeamNum() {
        System.out.println("setTeamNum");
         int teamnum = 0;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.setTeamNum(teamnum);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTeamNAME method, of class Hockey_TEAM.
     */
    @Test
    public void testSetTeamNAME() {
        System.out.println("setTeamNAME");
        String TeamNAME = null;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.setTeamNAME(TeamNAME);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setGamesPLAYED method, of class Hockey_TEAM.
     */
    @Test
    public void testSetGamesPLAYED() {
        System.out.println("setGamesPLAYED");
        int GamesPLAYED = 0;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.setGamesPLAYED(GamesPLAYED);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setTeamMangerName method, of class Hockey_TEAM.
     */
    @Test
    public void testSetTeamMangerName() {
        System.out.println("setTeamMangerName");
        String teamMangerName = null;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.setTeamMangerName(teamMangerName);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setMedicalmembers method, of class Hockey_TEAM.
     */
    @Test
    public void testSetMedicalmembers() {
        System.out.println("setMedicalmembers");
        int Medicalmembers = 23;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.setMedicalmembers(Medicalmembers);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTeamNum method, of class Hockey_TEAM.
     */
    @Test
    public void testGetTeamNum() {
        System.out.println("getTeamNum");
        Hockey_TEAM instance = new Hockey_TEAM();
       
        int expResult = 0;
        int result = instance.getTeamNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTeamNAME method, of class Hockey_TEAM.
     */
    @Test
    public void testGetTeamNAME() {
        System.out.println("getTeamNAME");
        Hockey_TEAM instance = new Hockey_TEAM();
        String expResult = null;
        String result = instance.getTeamNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getGamesPLAYED method, of class Hockey_TEAM.
     */
    @Test
    public void testGetGamesPLAYED() {
        System.out.println("getGamesPLAYED");
        Hockey_TEAM instance = new Hockey_TEAM();
        int expResult = 0;
        int result = instance.getGamesPLAYED();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getTeamMangerName method, of class Hockey_TEAM.
     */
    @Test
    public void testGetTeamMangerName() {
        System.out.println("getTeamMangerName");
        Hockey_TEAM instance = new Hockey_TEAM();
        String expResult = null;
        String result = instance.getTeamMangerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMedicalmembers method, of class Hockey_TEAM.
     */
    @Test
    public void testGetMedicalmembers() {
        System.out.println("getMedicalmembers");
        Hockey_TEAM instance = new Hockey_TEAM();
        int expResult = 0;
        int result = instance.getMedicalmembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of input method, of class Hockey_TEAM.
     */
    @Test
    public void testInput() {
        System.out.println("input");
        String TeamNAME = "LFC";
        String teamMangerName = "MAN";
        int teamNum = 21;
        int GamesPLAYED = 22;
        int Medicalmembers = 23;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.input(TeamNAME, teamMangerName, teamNum, GamesPLAYED, Medicalmembers);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of Display method, of class Hockey_TEAM.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        String TeamNAME = "LFC";
        String TeamMangerName = "MNA";
        int TeamNum = 21;
        int GamesPLAYED = 56;
        int Medicalmembers = 45;
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.Display(TeamNAME, TeamMangerName, TeamNum, GamesPLAYED, Medicalmembers);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of ReportNameDisplay method, of class Hockey_TEAM.
     */
    @Test
    public void testReportNameDisplay() {
        System.out.println("ReportNameDisplay");
        Hockey_TEAM instance = new Hockey_TEAM();
        instance.ReportNameDisplay();
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
