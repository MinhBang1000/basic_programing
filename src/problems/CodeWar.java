/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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

//    public static String rangeExtraction(int[] arr) {
//        String result =  "";
//        Stack<Integer> stack = new Stack();
//        int[] numbers = new int[arr.length + 1];
//        for (int i=0;i<arr.length;i++){
//            numbers[i] = arr[i];
//        }
//        numbers[numbers.length - 1] = arr[arr.length - 1] - 1;
//        stack.push(numbers[0]);
//        int previous = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] != previous + 1) {
//                if (stack.size() < 3) {
//                    String str = "";
//                    while (!stack.isEmpty()) {
//                        int top = stack.pop();
//                        str = top+"," + str;
//                    }
//                    result += str;
//                }else{
//                    int min = 0;
//                    while (!stack.isEmpty()) min = stack.pop();
//                    result += min+"-"+previous+",";
//                }
//            }
//            previous = numbers[i];
//            stack.push(numbers[i]);
//        }
//        return result.substring(0, result.length() - 1);
//    }
    
    public static String rangeExtraction(int[] arr) {
        String result = "";
        for (int i=0;i<arr.length;i++){
            result += arr[i]+"";
            int j = i;
            while (j<arr.length-1 && arr[j] + 1 == arr[j+1]) j++;
            if (j >= i + 2){
                i = j;
                result += "-"+arr[j];
            }
            result+=",";
        }
        return result.substring(0,result.length() - 1);
    }
}
