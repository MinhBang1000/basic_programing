/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class CodeWar {

    public static String pigIt(String str) {
        String[] arrayStr = str.split(" ");
        ArrayList<Character> alphabets = new ArrayList();
        for (char i = 'A'; i <= 'Z'; i++) {
            alphabets.add(i);
            alphabets.add(Character.toLowerCase(i));
        }
        for (int i = 0; i < arrayStr.length; i++) {
            String element = arrayStr[i];
            int j = 0;
            boolean flag = false;
            // Not found
            while (element.length() == 1 && j < element.length() && !flag) {
                if (alphabets.indexOf(element.charAt(0)) == -1) {
                    flag = true;
                }
                j++;
            }
            // Transfer
            if (!flag) {
                arrayStr[i] = arrayStr[i].substring(1, arrayStr[i].length()) + arrayStr[i].charAt(0) + "ay";
            }
        }
        String temp = "";
        for (int i = 0; i < arrayStr.length; i++) {
            temp += arrayStr[i];
            if (i != arrayStr.length - 1) {
                temp += " ";
            }
        }
        return temp;
    }

    public static int quarterOf(int month) {
        return (month + 2) / 3;
    }

    public static String createPhoneNumber(int[] numbers) {
        String first = "";
        String second = "";
        String third = "";
        for (int num : Arrays.copyOfRange(numbers, 0, 3)) {
            first += num + "";
        }
        for (int num : Arrays.copyOfRange(numbers, 3, 6)) {
            second += num + "";
        }
        for (int num : Arrays.copyOfRange(numbers, 6, 10)) {
            third += num + "";
        }
        return "(" + first + ") " + second + "-" + third + "";
    }

    public static int multiplesOf3Or5(int number) {
        int n3 = number / 3;
        int n5 = number / 5;
        int n35 = number / (3 * 5);
        if (number % 3 == 0) {
            n3 = n3 - 1;
        }
        if (number % 5 == 0) {
            n5 = n5 - 1;
        }
        if (number % 15 == 0) {
            n35 = n35 - 1;
        }
        return (n3 * (2 * 3 + (n3 - 1) * 3) / 2) + (n5 * (2 * 5 + (n5 - 1) * 5) / 2) - (n35 * (2 * 3 * 5 + (n35 - 1) * 3 * 5) / 2);
    }

    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public static String rangeExtraction(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + "";
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) {
                j++;
            }
            if (j >= i + 2) {
                i = j;
                result += "-" + arr[j];
            }
            result += ",";
        }
        return result.substring(0, result.length() - 1);
    }

    public static List<Integer> travelEdge(int[][] arr, int top, int bottom, int left, int right) {
        // Init List
        List<String> mark = new ArrayList<>();
        List<Integer> topList = new ArrayList<>();
        List<Integer> bottomList = new ArrayList<>();
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        int rows = bottom - top + 1;
        int columns = right - left + 1;
        for (int i = left; i <= right; i++) {
            int t = arr[top][i];
            String code = top + ":" + i;
            if (mark.indexOf(code) == -1) {
                topList.add(t);
                mark.add(code);
            }
        }
        for (int i = top; i <= bottom; i++) {
            String code = i + ":" + right;
            if (mark.indexOf(code) == -1) {
                rightList.add(arr[i][right]);
                mark.add(code);
            }
        }
        for (int i = left; i <= right; i++) {
            int t = arr[bottom][i];
            String code = bottom + ":" + i;
            if (mark.indexOf(code) == -1) {
                bottomList.add(0, t);
                mark.add(code);
            }
        }
        for (int i = top; i <= bottom; i++) {
            String code = i + ":" + left;
            if (mark.indexOf(code) == -1) {
                leftList.add(0, arr[i][left]);
                mark.add(code);
            }
        }
        List<Integer> totalList = new ArrayList<>();
        topList.forEach(element -> totalList.add(element));
        rightList.forEach(element -> totalList.add(element));
        bottomList.forEach(element -> totalList.add(element));
        leftList.forEach(element -> totalList.add(element));
        return totalList;
    }

    public static int[] snail(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[] result = new int[rows * columns];
        List<Integer> temp = new ArrayList<>();
        int left = -1;
        int right = array[0].length;
        int top = -1;
        int bottom = array.length;
        int index = 0;
        do {
            for (Integer t : temp) {
                result[index] = t;
                index++;
            }
            temp = new ArrayList<>();
            left++;
            right--;
            top++;
            bottom--;
            if (left <= right && top <= bottom) {
                temp = travelEdge(array, top, bottom, left, right);
            }
        } while (!temp.isEmpty());
//        for (int t : result) {
//            System.out.println(t);
//        }
        return result;
    }

    public static String toRoman(int n) {
        return "I";
    }

    public static int fromRoman(String romanNumeral) {
        return 1;
    }

    public static int sumWeight(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;
    }

    public static void bubbleSortString(List<List<String>> totalArr, int first, int last) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = first + 1; i <= last; i++) {
                if (totalArr.get(i).get(0).compareTo(totalArr.get(i - 1).get(0)) < 0) {
                    List<String> temp = totalArr.get(i);
                    totalArr.remove(i);
                    totalArr.add(i, totalArr.get(i - 1));
                    totalArr.remove(i - 1);
                    totalArr.add(i - 1, temp);
                    swapped = true;
                }
            }
        }
    }

    public static String orderWeight(String str) {
        System.out.println(str);
        List<String> arr = Arrays.asList(str.split(" "));
        List<List<String>> totalArr = new ArrayList<>();
        for (String item : arr) {
            int sum = sumWeight(item);
            List<String> temp = new ArrayList<>();
            temp.add(item);
            temp.add(sum + "");
            int i = 0;
            boolean flag = true;
            if (!totalArr.isEmpty()) {
                while (i < totalArr.size() && flag) {
                    if (Integer.parseInt(totalArr.get(i).get(1)) >= sum) {
                        flag = false;
                    }
                    i++;
                }
                if (i >= totalArr.size() && flag) {
                    totalArr.add(temp);
                } else {
                    totalArr.add(i - 1, temp);
                }
            } else {
                totalArr.add(temp);
            }
        }
        for (int i = 0; i < totalArr.size(); i++) {
            int j = i;
            while (j < totalArr.size() && Integer.parseInt(totalArr.get(j).get(1)) == Integer.parseInt(totalArr.get(i).get(1))) {
                j++;
            }
            bubbleSortString(totalArr, i, j - 1);
            i = j - 1;
        }
        String temp = "";
        for (List<String> itemStr : totalArr) {
            temp += itemStr.get(0) + " ";
        }
        System.out.println(temp);
        return temp.substring(0, temp.length() - 1);
    }

    // Học cách so sánh 2 điều kiện
    public static String orderW(String string) {
        String[] split = string.split(" ");
        Arrays.sort(split, new Comparator<String>() {
            public int compare(String a, String b) {
                int aWeight = a.chars().map(c -> Character.getNumericValue(c)).sum();
                int bWeight = b.chars().map(c -> Character.getNumericValue(c)).sum();
                return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
            }
        });
        return String.join(" ", split);
    }
    
    // Maze + Shortest path
    // Init 2D array of String  
    // Start at zero
    public static int[][] data;
    public static int n;
    public static String maze = "";
    public static int shortestPath = 0;

    public static List<Integer> friends(int index) {
        // start at one
        List<Integer> temp = new ArrayList<>();
        char point = maze.charAt(index);
        if (point != 'W') {
            // Have relationship
            // left check
            if (index % n != 0) {
                temp.add(index - 1);
            }
            // right check
            if ((index + 1) % n != 0) {
                temp.add(index + 1);
            }
            // top check
            if (index - n >= 0) {
                temp.add(index - n);
            }
            // bottom check
            if (index + n < n * n) {
                temp.add(index + n);
            }
        }
        return temp;
    }

    public static void initMaze(String strMaze) {
        // number of rows or columns
        n = 0;
        for (int i = 0; i < strMaze.length(); i++) {
            if (strMaze.charAt(i) != '\n') {
                maze += strMaze.charAt(i);
            } else {
                n++;
            }
        }
        n++;
        data = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                data[i][j] = -1;
                // non relationship
            }
        }
        for (int i = 0; i < n; i++) {
            List<Integer> friends = friends(i);
            for (int j : friends) {
                if (maze.charAt(j) != 'W') {
                    data[i][j] = 1;
                    data[j][i] = 1;
                }
            }
        }

    }

    // Graph
    public static List<Integer> adjacent(int index) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                if (data[i][j] != -1) {
                    temp.add(j);
                }
            }
        }
        return temp;
    }

    public static boolean[] mark;
    public static int[] pi;
    public static int[] p;

    public static void djikstra(int start) {
        mark = new boolean[n * n];
        pi = new int[n * n];
        p = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            mark[i] = false;
            pi[i] = -9999;
            p[i] = -1;
        }
        pi[start] = 0;
        p[start] = -1;
        for (int it = 0; it < n * n; it++) {
            int minPi = 9999;
            int j = 1;
            for (int i = 0; i < n * n; i++) {
                if (!mark[i] && pi[i] < minPi) {
                    minPi = pi[i];
                    j = i;
                }
            }
            mark[j] = true;
            List<Integer> friends = adjacent(j);
            for (int i = 0; i < friends.size(); i++) {
                int y = friends.get(i);
                if (!mark[y] && pi[y] > pi[j] + data[j][y]) {
                    pi[y] = pi[j] + data[j][y];
                    p[y] = j;
                }
            }
        }
    }

    public static void mazeShortestPath(String strMaze) {
        initMaze(strMaze);
        djikstra(0);
        System.out.println(pi[n - 1]);
    }

}
