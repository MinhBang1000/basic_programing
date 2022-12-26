/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class Unity {

    public static void printList(int arr[]) {
        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        lst.forEach(item -> System.out.print(item + " "));
    }

    public static void printList(List<Integer> lst) {
        lst.forEach(item -> System.out.print(item + " "));
    }
}
