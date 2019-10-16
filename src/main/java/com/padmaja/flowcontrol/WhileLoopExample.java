package com.padmaja.flowcontrol;
import java.lang.String;

public class WhileLoopExample {
    public int tablesExample(int num,boolean divisibleBy7) {
       // boolean divisibleBy7 = false;
        while(!divisibleBy7){
            System.out.println(num);
            if (num % 7 == 0)divisibleBy7 = true;
            --num;
        }
        return num;

    }

    public int whileLoopExample2(int num, boolean divisibleBy7) {
        //boolean divisibleBy7 = true;
        while(divisibleBy7 == false){
            System.out.println(num);
            if (num % 7 == 0)divisibleBy7 = true;
            --num;
        }
        return num;

    }

}