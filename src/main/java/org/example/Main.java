package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sock = input.nextInt();
        if (sock == 1 ){
            int s1 = input.nextInt();
            int s2 = input.nextInt();
            System.out.println(1);
            System.exit(0);

        }
        int [] arr =new int[sock +1];
                                        //  {0 , 1 , 2 , 3}
        int table =0;                    //  {0 , 2 , 2 , 2}
        int counter = 0;                  //       00  00  00        max = 2
        for (int i =0;i<sock*2 ;i++){
            int socks= input.nextInt();
            if (arr[socks] == 0){
                arr[socks] ++;
                table ++;
                counter =java.lang.Math.max(table,counter);
            }else {
                table --;
            }
        }
        System.out.println(counter);


    }
}