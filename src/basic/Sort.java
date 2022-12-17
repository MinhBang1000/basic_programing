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
    
// SELECTION SORT
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
    
// INSERTION SORT
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
    
// MERGE SORT
    public static void merge(int[] numbers, int left, int mid, int right){
        // Initial two tempory list
        int[] leftList = new int[numbers.length];
        int[] rightList = new int[numbers.length];
        int numLeft = mid - left + 1;
        int numRight = right - mid;
        // Copy element to 2 list above
        for (int i=0;i<numLeft;i++) {
            leftList[i] = numbers[left+i];
        }
        for (int i=0;i<numRight;i++){
            rightList[i] = numbers[mid + i + 1];
        }
        // Merge two list
        int i = 0,j = 0;
        int k = left;
        while (i < numLeft && j < numRight){
            if (leftList[i] < rightList[j]){
                numbers[k] = leftList[i];
                i++;
            }else{
                numbers[k] = rightList[j];
                j++;
            }
            k++;
        }
        // Continue with the rest of two list
        while (i < numLeft){
            numbers[k] = leftList[i];
            i++;
            k++;
        }
        while (j < numRight){
            numbers[k] = rightList[j];
            j++;
            k++;
        }
    }
    
    public static void mergeSort(int [] numbers, int left, int right){
        if (left < right){
            int mid = left + (right - left)/2;
            Sort.mergeSort(numbers, left, mid);
            Sort.mergeSort(numbers, mid + 1, right);
            Sort.merge(numbers, left, mid, right);
        }
    }
}
