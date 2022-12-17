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
public class Sort {
    // GLOBAL VARIABLE
    private static int MAX_INF = 99999;
    
    // QUICK SORT 
    public static int findPivot(int[] numbers, int start, int end) {
        int index = start;
        int top = numbers[start];
        while (top == numbers[index] && index < end) {
            index++;
        }
        if (index == end && numbers[index] == top) {
            return -1;
        }
        if (numbers[index] <= top) {
            return start;
        }
        return index;
    }

    public static int partitionList(int[] numbers, int pivot, int left, int right) {
        while (left < right) {
            while (numbers[left] < pivot && left <= right) {
                left++;
            }
            while (numbers[right] >= pivot && left <= right) {
                right--;
            }
            if (left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        }
        return left;
    }
    
    public static void quickSort(int[] numbers, int left, int right) {
        int index = Sort.findPivot(numbers, left, right);
        if (index != -1) {
            int k = Sort.partitionList(numbers, numbers[index], left, right);
            Sort.quickSort(numbers, left, k - 1);
            Sort.quickSort(numbers, k, right);
        }
    }
    
//    SELECTION SORT
    public static void selectionSort(int[] numbers){
        for (int i=0;i<numbers.length-1;i++){
            int min = numbers[i];
            int index = i;
            for (int j=i+1;j<numbers.length;j++){
                if (min > numbers[j]){
                    index = j;
                    min = numbers[j];
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
    }
    
//    INSERTION SORT
    public static void insertionSort(int[] numbers) {
        for (int i=0;i<numbers.length;i++){
            int j = i - 1;
            int key = numbers[i];
            while (j>=0 && numbers[j] > key) {
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                j--;
            }
        }
    }
    
// BUBBLE SORT
    public static void bubbleSort(int[] numbers){
        boolean flag = true;
        int last = numbers.length - 1;
        while (flag) {
            flag = false;
            for (int i=0;i<last;i++){
                if (numbers[i] > numbers[i+1]) {
                    numbers[i] = numbers[i] + numbers[i+1];
                    numbers[i+1] = numbers[i] - numbers[i+1];
                    numbers[i] = numbers[i] - numbers[i+1];
                    flag = true;
                }
            }
        }
    }
    
}
