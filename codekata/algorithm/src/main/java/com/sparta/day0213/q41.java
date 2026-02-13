package com.sparta.day0213;

public class q41 {
    public static void main(String[] args) {
        String s="try hello world";

        StringBuilder sb = new StringBuilder();
        char[] input = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] == ' '){ sb.append(' '); idx=0; }
            else{
                sb.append(idx%2==0 ? Character.toUpperCase(input[i]): Character.toLowerCase(input[i]));
                idx++;
            }
        }
        System.out.println(sb.toString());
    }
}
