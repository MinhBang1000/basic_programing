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
public class Kata {

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
    
    
}
