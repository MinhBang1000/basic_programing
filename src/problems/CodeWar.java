/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;
import java.util.Arrays;
/**
 *
 * @author Administrator
 */
public class CodeWar {

    public static int quarterOf(int month) {
        return (month + 2) / 3;
    }

    public static String createPhoneNumber(int[] numbers) {        
        String first = "";
        String second = "";
        String third = "";
        for (int num : Arrays.copyOfRange(numbers, 0, 3)){
            first += num+"";
        }
        for (int num : Arrays.copyOfRange(numbers, 3, 6)) {
            second += num+"";
        }
        for (int num : Arrays.copyOfRange(numbers, 6, 10)) {
            third += num+"";
        }
        return "("+first+") "+second+"-"+third+"";
    }
    
    public static int multiplesOf3Or5(int number) {
        int n3 = number/3;
        int n5 = number/5;
        int n35 = number/(3*5);
        if (number % 3 == 0) {
            n3 = n3 - 1;
        }
        if (number % 5 == 0){
            n5 = n5 - 1;
        }
        if (number % 15 == 0){
            n35 = n35 - 1;
        }
        return (n3*(2*3+(n3-1)*3)/2) + (n5*(2*5+(n5-1)*5)/2) - (n35*(2*3*5 + (n35-1)*3*5)/2);
    }
    
}
