/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import problems.CodeWar;

/**
 *
 * @author Administrator
 */
public class CodeWarTest {
    // Quater
    @Test
    public void quarterOfTest1() { 
        Assert.assertEquals(CodeWar.quarterOf(3), 1);
    }
    @Test    
    public void quarterOfTest2() { 
        Assert.assertEquals(CodeWar.quarterOf(8), 3);
    }
    @Test    
    public void quarterOfTest3() { 
        Assert.assertEquals(CodeWar.quarterOf(11), 4);
    }
    // Create Phone Number
    @Test
    public void quarterOfTest4() { 
        Assert.assertEquals(CodeWar.createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}), "(123) 456-7890");
    }
    
    @Test
    public void multiplesOf3Or5Test1(){
        int actual = CodeWar.multiplesOf3Or5(20);
        Assert.assertEquals(78, actual);
    }
    
    @Test
    public void pigItTest1(){
        String test = CodeWar.pigIt("Pig latin is cool");
        Assert.assertEquals("igPay atinlay siay oolcay", test);
    }
    
        @Test
    public void pigItTest2(){
        String test = CodeWar.pigIt("Hello world !");
        Assert.assertEquals("elloHay orldway !", test);
    }
}
