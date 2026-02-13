package com.sparta.day0213;

public class q32 {
    public static int solution(int[] a, int[] b) {
        int len = a.length;
        int ret = 0;
        for(int i=0;i<len; i++){ ret+=a[i]*b[i]; }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
        System.out.println(solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}
