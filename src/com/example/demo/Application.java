package com.example.demo;


import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hmCount = 0;
        String str = "";
        int count = 0;

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        do {
            System.out.println("Enter a string");
            str = input.next();
            input.nextLine();
            hm.put(hmCount,str);
            hmCount++;
            for(String s : hm.values()){
                if(str.matches(s)){
                    count++;
                };
            }
            System.out.println(str + " has been added " + count + " times");
            if(count > 0){
                count = 0;
            }
        } while (!"quit".equals(str));
    }
}
