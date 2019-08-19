package com.gaehyun.algorithm;

public class codingTest2 {

    public static void codingTest2(int [][] s){

        int x = 0,y = 0;
        for(int i=0; i<s.length; i++){
            for(int j=0; j<s[i].length; j++){
                if(s[i][j] == 1){
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(x);
        System.out.println(y);

        int [][] temp = new int[3][3];



        int num=0;
        int sum=0;
        for(num=1;num<=9;num++){

            temp[x][y]=num;
            if(temp[x][y] != s[x][y]){
               sum+=Math.abs( temp[x][y] - s[x][y]);
            }

            if(num%3==0){

                x++;

                if(x==3)x=0;

            }else{

              //  x--;y++;

                x--;
                y--;

                if(x==-1)x=3-1;
                if(y==-1)y=2;

               // if(y==3)y=0;

            }

        }

        for(int i=0; i<s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }



        System.out.println("sum : "+sum);
    }
}
