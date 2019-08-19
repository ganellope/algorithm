package com.gaehyun.algorithm;

public class BinaryGap {

    public int solution(int N) {

        if(N==1 || N ==0){
            return 0;
        }
        String binary = Integer.toBinaryString(N);
        String []n = binary.split("1");
        int maxGap = 0;
            for (String a:n) {
            if(maxGap < a.length()){
                maxGap = a.length();
            }
        }
        if(n.length == 2 && binary.endsWith("0")){
            return 0;
        }


        return maxGap;
    }

}
