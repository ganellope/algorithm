package com.gaehyun.algorithm;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
public class charDesc {
    public String charDesc(String str){
        String[] strArr = new String[str.length()];
        for(int i=0;i<str.length(); i++){
            strArr[i]=str.substring(i,i+1); //문자열을 문자열배열로 변경
        }

        Arrays.sort(strArr,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(str.charAt(str.indexOf(s1)) < str.charAt(str.indexOf(s2))){ //char로 비교한다.
                    return 1; //내림차순이니까 작은거를 return 1
                }else if(str.charAt(str.indexOf(s1)) > str.charAt(str.indexOf(s2))){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        String temp = "";
        for(int i=0;i<strArr.length; i++){
            temp+=strArr[i];
        }

        return temp;
    }
}
