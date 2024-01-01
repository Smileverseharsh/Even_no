package Apna.function;

import java.util.Scanner;

public class even_no {
    public static  int prime(int n){
        // using if else
        if (n%2 == 0)
         System.out.println("No. is prime");
        else
            System.out.println("Number is not prime");
        return n;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter No. to check prime");
    int n= sc.nextInt();
    prime(n);
}
}


