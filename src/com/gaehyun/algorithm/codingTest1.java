package com.gaehyun.algorithm;


import java.util.Arrays;

public class codingTest1 {

    public void Sort(long[] Price){
        long max = Price[0];

        for(int i=0; i<Price.length; i++){
            for(int j=i+1; j<Price.length; j++){
                if(Price[i] > Price[j])
                {
                    long temp = Price[i];
                    Price[i] = Price[j];
                    Price[j] = temp;
                }
            }
        }


        for(int i=0; i<Price.length; i++){
        System.out.println(Price[i]);
    }
    long min = Price[Price.length-1] - Price[Price.length-2];
    for(int i= Price.length-1; i>0; i--){
        if(min > (Price[i]-Price[i-1])){
            min =  (Price[i]-Price[i-1]);
        }
    }

    System.out.println("test : "+min);


    }
}
