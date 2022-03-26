package com.company;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A =sc.next();
        String B =sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length() + B.length();
        System.out.println(len);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(A.substring(0).toUpperCase()+" ");
        System.out.print(B.substring(0).toUpperCase());
    }
}
