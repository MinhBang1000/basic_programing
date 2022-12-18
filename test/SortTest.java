/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.Sort;
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
public class SortTest {

    @Test
    public void qSortTest1() {
        int[] expecteds = new int[]{1, 2, 3, 4, 5};
        int[] actuals = new int[]{2, 3, 1, 4, 5};
        Sort.quickSort(actuals, 0, actuals.length - 1);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void qSortTest2() {
        int[] expecteds = new int[]{1, 2, 3, 3, 3, 3, 4, 5};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5};
        Sort.quickSort(actuals, 0, actuals.length - 1);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void qSortTest3() {
        int[] expecteds = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5, 6, 2, 1, 3, 5, 7};
        Sort.quickSort(actuals, 0, actuals.length - 1);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void sSortTest1() {
        int[] expecteds = new int[]{7, 8, 9, 9};
        int[] actuals = new int[]{9, 7, 8, 9};
        Sort.selectionSort(actuals);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void sSortTest2() {
        int[] expecteds = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5, 6, 2, 1, 3, 5, 7};
        Sort.selectionSort(actuals);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void iSortTest1() {
        int[] expecteds = new int[]{8, 13, 20, 40};
        int[] actuals = new int[]{40, 8, 20, 13};
        Sort.insertionSort(actuals);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void iSortTest2() {
        int[] expecteds = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5, 6, 2, 1, 3, 5, 7};
        Sort.insertionSort(actuals);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void bSortTest1() {
        int[] expecteds = new int[]{8, 13, 20, 40};
        int[] actuals = new int[]{40, 8, 20, 13};
        Sort.bubbleSort(actuals);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void bSortTest2() {
        int[] expecteds = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5, 6, 2, 1, 3, 5, 7};
        Sort.bubbleSort(actuals);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void mSortTest1() {
        int[] expecteds = new int[]{8, 13, 20, 40};
        int[] actuals = new int[]{40, 8, 20, 13};
        Sort.mergeSort(actuals, 0, actuals.length - 1);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }

    @Test
    public void mSortTest2() {
        int[] expecteds = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5, 6, 2, 1, 3, 5, 7};
        Sort.mergeSort(actuals, 0, actuals.length - 1);
        Assert.assertArrayEquals("OK", expecteds, actuals);
    }
    
    @Test
    public void binarySearchTest1() {
        int expecteds = 1;
        int [] actuals = new int[] {1,4,3,5,6};
        Sort.bubbleSort(actuals);
        Assert.assertEquals(expecteds, Sort.binarySearch(actuals, 3, 0, actuals.length-1));
    }
}
