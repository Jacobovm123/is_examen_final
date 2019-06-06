/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

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
public class BubbleSortTest {
    

    /**
     * Test of sortBasic method, of class BubbleSort.
     */
    @Test
    public void testSortBasic() {
        System.out.println("sortBasic");
        int[] numbers = null;
        int[] expResult = null;
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
      
    }
    
}
