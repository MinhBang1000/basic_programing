/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Administrator
 */
public class Search {
// Binary Search - must be sorted !
    public static int binarySearch(int[] arr, int x, int start, int end) {
        if (start < end){
            int index = start + (end - start) / 2;
            if (arr[index] == x) {
                return index;
            }else{
                if (arr[index] > x){
                    return binarySearch(arr, x, start, index - 1);
                }
                return binarySearch(arr, x, index + 1, end);
            }
        }
        return -1;
    }
}
