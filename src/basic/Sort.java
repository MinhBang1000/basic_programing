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
// SELECTION SORT

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                arr[index] += arr[i];
                arr[i] = arr[index] - arr[i];
                arr[index] -= arr[i];
            }
        }
    }

// INSERTION SORT
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                arr[j] += arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] -= arr[j - 1];
                j--;
            }
        }
    }

// BUBBLE SORT
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int last = arr.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            last--;
        }
    }

// QUICK SORT
    public static int findPivot(int[] numbers, int start, int end) {
        int firstKey = numbers[start];
        int index = start;
        while (numbers[index] == firstKey && index < end) {
            index++;
        }
        if (index == end && numbers[index] == firstKey) {
            return -1;
            // Not found a pivot
        }
        if (numbers[index] < firstKey) {
            return start;
        }
        return index;
    }

    public static int partitionList(int[] numbers, int pivot, int left, int right) {
        int l = left;
        int r = right;
        while (l < r) {
            while (numbers[l] < pivot && l <= r) {
                l++;
            }
            while (numbers[r] >= pivot && l <= r) {
                r--;
            }
            if (l < r) {
                numbers[l] += numbers[r];
                numbers[r] = numbers[l] - numbers[r];
                numbers[l] -= numbers[r];
            }
        }
        return l;
    }

    public static void quickSort(int[] numbers, int left, int right) {
        int index = Sort.findPivot(numbers, left, right);
        if (index != -1) {
            int k = Sort.partitionList(numbers, numbers[index], left, right);
            Sort.quickSort(numbers, left, k - 1);
            Sort.quickSort(numbers, k, right);
        }
    }

//  MERGE SORT
    public static void mergeList(int[] arr, int left, int mid, int right) {
        int numLeft = mid - left + 1;
        int numRight = right - mid;
        int[] leftList = new int[arr.length];
        int[] rightList = new int[arr.length];
        // Copy elements of total list
        for (int i = 0; i < numLeft; i++) {
            leftList[i] = arr[left + i];
        }
        for (int i = 0; i < numRight; i++) {
            rightList[i] = arr[mid + 1 + i];
        }
        int l = 0;
        int r = 0;
        int k = left;
        while (l < numLeft && r < numRight) {
            if (leftList[l] < rightList[r]) {
                arr[k] = leftList[l];
                l++;
            } else {
                arr[k] = rightList[r];
                r++;
            }
            k++;
        }
        // The rest collect
        while (l < numLeft) {
            arr[k] = leftList[l];
            l++;
            k++;
        }
        while (r < numRight) {
            arr[k] = rightList[r];
            r++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            Sort.mergeSort(arr, left, mid);
            Sort.mergeSort(arr, mid + 1, right);
            Sort.mergeList(arr, left, mid, right);
        }
    }

//    BINARY SEARCH
    public static int binarySearch(int[] arr, int x, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            if (arr[mid] < x) {
                return binarySearch(arr, x, mid + 1, right);
            }
            return binarySearch(arr, x, left, mid);
        }
        return -1;
    }
}
