/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import tools.Unity;

/**
 *
 * @author Administrator
 */
public class Sort {

    private static void swap(int[] arr, int a, int b) {
        arr[a] += arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

//Selection sort
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
            if (i != index) {
                swap(arr, i, index);
            }
        }
    }

//Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

//Bubble sort
    public static void bubbleSort(int arr[]) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    if (!swapped) {
                        swapped = true;
                    }
                    swap(arr, i, i + 1);
                }
            }
        }
    }

//Quick sort
    public static int findPivot(int arr[], int start, int end) {
        int i = start + 1;
        while (i <= end && arr[i] == arr[start]) {
            i++;
        }
        if (i - 1 == end && arr[i - 1] == arr[start]) {
            i = -1;
        } else {
            if (arr[start] > arr[i]) {
                i = start;
            }
        }
        return i;
    }

    public static int partition(int arr[], int pivot, int start, int end) {
        int l = start;
        int r = end;
        while (l < r) {
            while (l <= r && arr[l] < pivot) {
                l++;
            }
            while (l <= r && arr[r] >= pivot) {
                r--;
            }
            if (l < r) {
                arr[l] += arr[r];
                arr[r] = arr[l] - arr[r];
                arr[l] -= arr[r];
            }
        }
        return l;
    }

    public static void quickSort(int arr[], int start, int end) {
        int i = findPivot(arr, start, end);
//      Found pivot
        if (i != -1) {
            int k = partition(arr, arr[i], start, end);
            quickSort(arr, start, k - 1);
            quickSort(arr, k, end);
        }
    }

//Merge sort
    public static void merge(int arr[], int start, int mid, int end) {
        int left = mid - start + 1;
        int right = end - mid;
        int[] leftLst = new int[left];
        int[] rightLst = new int[right];
        int[] totalLst = arr;
        for (int i = 0; i < left; i++) {
            leftLst[i] = arr[start + i];
        }
        for (int i = 0; i < right; i++) {
            rightLst[i] = arr[mid + i + 1];
        }
        int l = 0;
        int r = 0;
        int i = start;
        while (l < left && r < right) {
            if (leftLst[l] < rightLst[r]) {
                totalLst[i] = leftLst[l];
                l++;
            } else {
                totalLst[i] = rightLst[r];
                r++;
            }
            i++;
        }
        while (l < left) {
            totalLst[i] = leftLst[l];
            l++;
            i++;
        }
        while (r < right) {
            totalLst[i] = rightLst[r];
            r++;
            i++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
}
