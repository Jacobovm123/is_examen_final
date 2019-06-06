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
  
    }
    
    @Test
    public void testSortBasic1() {
        System.out.println("sortBasic");
        int[] numbers = new int []{0};
        int[] expResult = new int []{1};
        int[] result = BubbleSort.sortBasic(numbers);
  
    }
    
   

       @Test
    public void testSortBasic2() {
        System.out.println("sortBasic");
        int[] numbers = new int []{1,2,3,4,5};
        int[] expResult = new int []{120,60,40,30,24};
        int[] result = BubbleSort.sortBasic(numbers);
  
    }
    
        // wh
    
      @Test
    public void testSortBasic3() {
        System.out.println("sortBasic");
        int[] numbers = new int []{0};
        int[] expResult = new int []{1};
        int[] result = BubbleSort.sortBasic(numbers);
  
    }
    
    
          @Test
    public void testSortBasic4() {
        System.out.println("sortBasic");
        int[] numbers = new int []{1};
        int[] expResult = new int []{1};
        int[] result = BubbleSort.sortBasic(numbers);
  
    }
    
}
