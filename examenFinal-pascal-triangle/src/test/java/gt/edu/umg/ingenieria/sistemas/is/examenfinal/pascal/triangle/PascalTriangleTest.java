/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricardo
 */
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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
     * Test of build method, of class PascalTriangle.
     */
   
    @Test
    public void testNormalSize() {
        System.out.println("Probando");
        int levels = 2;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[1]\n[1, 1]\n";
        String result = instance.build(levels);
        assertEquals("fail"+result,expResult, result);

    }

    @Test
    public void testLevelAmount() {
        System.out.println("Probando");
        int levels =10;
        PascalTriangle instance = new PascalTriangle();        
        String result = instance.build(levels);
        int counter = 0; 
        for(char c: result.toCharArray()){
            if(c=='\n')
            {
                counter++;
            }
        }
        assertTrue(counter==levels);        
    }
    
    
       @Test
    public void cero() {
        System.out.println("nivel o");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("fail"+result,expResult, result);

    }


    
}
