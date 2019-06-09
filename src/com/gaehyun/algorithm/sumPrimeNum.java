package com.gaehyun.algorithm;

public class sumPrimeNum {

    public long sumPrimeNum(long num){
        if(num==2){
            return 2;
        }else if(num<=1){
            return 0;
        }

        long sum  = 2;
        boolean check=true;
        for(int i=3; i<=num; i+=2){
            check=true;
            for(int j=2; j<i; j++){
                if(i%j==0) {
                    check = false;
                    break;
                }
            }//for j
            if(check){
                System.out.print(","+i);
                sum = sum+i;
            }
        } // for i

        return sum;
    }
}
