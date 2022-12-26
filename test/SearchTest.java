/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.Search;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class SearchTest {

    @Test
    public void binarySearchTest1() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals("OK", 2, Search.binarySearch(arr, 3, 0, arr.length - 1));
    }

    @Test
    public void binarySearchTest2() {
        int[] arr = new int[]{40, 8, 20, 13};
        Assert.assertEquals("OK", 2, Search.binarySearch(arr, 8, 0, arr.length - 1));
    }
}
