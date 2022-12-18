/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.Fibonancci;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

/**
 *
 * @author Administrator
 */
public class FibonancciTest {

    @Test
    public void fiboTest1() {
        Assert.assertEquals("OK", 55, Fibonancci.regression(10));
    }

    @Test
    public void fiboTest2() {
        Assert.assertEquals("OK", 8, Fibonancci.regression(6));
    }

    @Test
    public void fiboTest3() {
        Assert.assertEquals("OK", 55, Fibonancci.nonRegression(10));
    }

    @Test
    public void fiboTest4() {
        Assert.assertEquals("OK", 8, Fibonancci.nonRegression(6));
    }
}
