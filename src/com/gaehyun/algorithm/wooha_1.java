package com.gaehyun.algorithm;

public class wooha_1 {
    public String solution(int U, int L, int[] C) {
        // write your code in Java SE 8

        int arr[][]=new int[U+L][2];

        int total = 0;

        for(int n: C){
            total+=n;
        }
        if(total<(U+L)) return "IMPOSSIBLE";
        int a= 0;
        boolean check=true;
        for(int i=0; i<arr.length; i++){
            check= true;
            for(int j=0; j<arr[1].length; j++){
                arr[i][j]=0;
                if(C[i]==2) {
                    arr[i][j] = 1;
                }
                if(C[i]==1 && a<U && check){
                    arr[i][j]=1;
                    check=false;
                }
                if(j==0) a+=arr[i][j];
            }
        }
        System.out.println("a : "+a);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[1].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        return "";
    }

}
