/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class Fibonancci {

    public static int regression(int start) {
        if (start == 0 || start == 1) {
            return start;
        }
        return regression(start - 1) + regression(start - 2);
    }

    public static int nonRegression(int start) {
        int result = 0;
        Stack<Integer> s = new Stack();
        s.push(start);
        while (!s.isEmpty()) {
            int last = s.pop();
            if (last == 0 || last == 1) {
                result+=last;
            } else {
                s.push(last - 1);
                s.push(last - 2);
            }
        }
        return result;
    }
}
