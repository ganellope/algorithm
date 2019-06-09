package com.gaehyun.algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class maxNum {
    public String maxNum(int[] nums){

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){ //자기자신과 비교할 필요 없으니 i에 1을 더해준다
                if(Integer.parseInt((String.valueOf(nums[i])+String.valueOf(nums[j]))) //문자로 더하고 숫자로 변경해 비교
                        < Integer.parseInt((String.valueOf(nums[j])+String.valueOf(nums[i])))){
                    int temp = nums[j]; //i와 j순서 바꿔주는 중
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        String answer = "";

        for(int i=0; i<nums.length; i++){
            answer+=String.valueOf(nums[i]); //문자열로 변경해 return
        }

        return answer;
    }
}
