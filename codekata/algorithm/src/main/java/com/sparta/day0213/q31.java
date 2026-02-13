package com.sparta.day0213;

public class q31 {

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            if(i%2==1)
                sb.append("수");
            else
                sb.append("박");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(3).equals("수박수"));
        System.out.println(solution(4).equals("수박수박"));
    }
}
