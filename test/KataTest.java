/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import problems.Kata;
//import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class KataTest {
    // Quater
    @Test
    public void test1() { 
        Assert.assertEquals(Kata.quarterOf(3), 1);
    }
    @Test    
    public void test2() { 
        Assert.assertEquals(Kata.quarterOf(8), 3);
    }
    @Test    
    public void test3() { 
        Assert.assertEquals(Kata.quarterOf(11), 4);
    }
    // Create Phone Number
    @Test
    public void test4() { 
        Assert.assertEquals(Kata.createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}), "(123) 456-7890");
    }
}
