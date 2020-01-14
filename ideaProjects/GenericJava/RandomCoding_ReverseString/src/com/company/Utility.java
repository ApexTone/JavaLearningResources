package com.company;

import java.util.Stack;

public class Utility {
    public static String reverseString(String text){
        Stack<Character> stacks = new Stack<Character>();
        for(int i=0;i<text.length();i++){
            stacks.push(text.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stacks.empty()){
            sb.append(stacks.pop());
        }
        return sb.toString();
    }
}
