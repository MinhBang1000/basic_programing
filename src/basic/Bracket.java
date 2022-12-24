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
public class Bracket {
    
    
    public static boolean validParentheses(String parens) {
        String brackets = parens;
        if (brackets.equals("")) {
            return false;
        }
        Stack<Character> stack = new Stack();
        String[] arrBracket = brackets.split("");
        // Check str all of brackets
        int j = 0;
        int count = arrBracket.length;
        for (int i=0;i<count;i++){
            if (!arrBracket[i].equals("(") && !arrBracket[i].equals(")")){
                j = i;
                while (j<count-1) {
                    arrBracket[j] = arrBracket[j+1];
                    j ++;
                }
                count--;
                i=-1;
            }
        }
        for (int i=0;i<count;i++){
            String t = arrBracket[i];
            if (t.equals("(")){
                stack.push(t.charAt(0));
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
