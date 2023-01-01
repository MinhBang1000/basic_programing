/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import problems.Structure.TreeNode;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import problems.CodeWar;
import tools.Unity;

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
        Assert.assertEquals(CodeWar.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
    }

    @Test
    public void multiplesOf3Or5Test1() {
        int actual = CodeWar.multiplesOf3Or5(20);
        Assert.assertEquals(78, actual);
    }

    @Test
    public void pigItTest1() {
        String test = CodeWar.pigIt("Pig latin is cool");
        Assert.assertEquals("igPay atinlay siay oolcay", test);
    }

    @Test
    public void pigItTest2() {
        String test = CodeWar.pigIt("Hello world !");
        Assert.assertEquals("elloHay orldway !", test);
    }

    @Test
    public void humanReadableTimeTest1() {
        assertEquals("makeReadable(0)", "00:00:00", CodeWar.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", CodeWar.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", CodeWar.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", CodeWar.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", CodeWar.makeReadable(359999));
    }

    @Test
    public void rangeExtractionTest1() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", CodeWar.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        assertEquals("-3--1,2,10,15,16,18-20", CodeWar.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }

    @Test
    public void snailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    @Test
    public void snailTest2() {
        int[][] array
                = {{1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}};
        int[] r = {1, 2, 3, 9, 4, 1, 4, 3, 2, 1, 7, 4, 5, 6, 9, 8};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        Assert.assertArrayEquals(result, CodeWar.snail(array));
        CodeWar.travelEdge(array, 0, array.length - 1, 0, array[0].length - 1);
    }

//    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", CodeWar.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", CodeWar.toRoman(2), is("II"));
    }

//    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", CodeWar.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", CodeWar.fromRoman("II"), is(2));
    }

    @Test
    public void weightSortTest1() {
        assertEquals("2000 103 123 4444 99", CodeWar.orderWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", CodeWar.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        assertEquals("1 2 200 4 4 6 6 7 7 18 27 72 81 9 91 425 31064 7920 67407 96488 34608557 71899703", CodeWar.orderWeight("71899703 200 6 91 425 4 67407 7 96488 6 4 2 7 31064 9 7920 1 34608557 27 72 18 81"));
    }

    @Test
    public void threeMaxNumbersTest1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4};
        int[] expecteds = new int[]{6, 5, 4};
        Assert.assertArrayEquals(expecteds, CodeWar.threeMaxNumbers(arr));
    }

    @Test
    public void oneLoopSortTest1() {
        int[] actuals = new int[]{40, 13, 8, 21};
        int[] expecteds = new int[]{8, 13, 21, 40};
        CodeWar.oneLoopSort(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void oneLoopSortTest2() {
        int[] expecteds = new int[]{1, 2, 3, 3, 3, 3, 4, 5};
        int[] actuals = new int[]{2, 3, 3, 3, 3, 1, 4, 5};
        CodeWar.oneLoopSort(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void validParentheseTest1() {
        Assert.assertEquals(true, CodeWar.validParentheses("()"));
        Assert.assertEquals(false, CodeWar.validParentheses("())"));
        Assert.assertEquals(true, CodeWar.validParentheses("32423(sgsdg)"));
        Assert.assertEquals(false, CodeWar.validParentheses("(dsgdsg))2432"));
        Assert.assertEquals(true, CodeWar.validParentheses("adasdasfa"));
    }

    @Test
    public void fibonancciTest1() {
        Assert.assertEquals(55, CodeWar.fibonancci(10));
    }

    @Test
    public void fibonancciTest2() {
        Assert.assertEquals(55, CodeWar.fibo(10));
    }

    @Test
    public void factorialTest1() {
        Assert.assertEquals(3628800, CodeWar.factorial(10));
    }

    private void assertTreeEqual(TreeNode expectedTree, TreeNode userTree) {
        if (expectedTree == null || userTree == null) {
            return;
        }

        if ((expectedTree.left == null && userTree.left != null) || (expectedTree.left != null && userTree.left == null)) {
            Assert.assertFalse("left null node and none null node found", true);

        }

        if ((expectedTree.right == null && userTree.right != null) || (expectedTree.right != null && userTree.right == null)) {
            Assert.assertFalse("right null node and none null node found", true);
        }

        Assert.assertEquals("values do not match", expectedTree.value, userTree.value);

        if (expectedTree.left != null) {
            assertTreeEqual(expectedTree.left, userTree.left);
        }

        if (expectedTree.right != null) {
            assertTreeEqual(expectedTree.right, userTree.right);
        }
    }

    @Test
    public void binaryTreeInvertTest1() {
        TreeNode given = new TreeNode(4);
        given.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        given.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

        TreeNode expected = new TreeNode(4);
        expected.right = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        expected.left = new TreeNode(7, new TreeNode(9), new TreeNode(6));

        assertTreeEqual(expected, CodeWar.invertTree(given));
    }

    @Test
    public void rgbToHexTest1() {
        Assert.assertEquals("For input: (0, 0, 0)", "000000", CodeWar.rgb(0, 0, 0));
        Assert.assertEquals("For input: (1, 2, 3)", "010203", CodeWar.rgb(1, 2, 3));
        Assert.assertEquals("For input: (255, 255, 255)", "FFFFFF", CodeWar.rgb(255, 255, 255));
        Assert.assertEquals("For input: (254, 253, 252)", "FEFDFC", CodeWar.rgb(254, 253, 252));
        Assert.assertEquals("For input: (-20, 275, 125)", "00FF7D", CodeWar.rgb(-20, 275, 125));
    }

    @Test
    public void multiplicationTableTest1() {
        int[][] test1 = {{1}};
        assertArrayEquals(test1, CodeWar.multiplicationTable(1));
    }

    @Test
    public void multiplicationTableTest2() {
        int[][] test = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertArrayEquals(test, CodeWar.multiplicationTable(3));
    }
}
