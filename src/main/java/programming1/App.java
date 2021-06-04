/*
Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("How many people? ");
        int a= in.nextInt();

        System.out.print("How many pizzas do you have? ");
        int b= in.nextInt();

        System.out.print("How many slices per pizza? ");
        int c= in.nextInt();

       int quo=(b*c)/a;
       int remain=(b*c)%a;

        System.out.printf("%d people with %d pizzas (%d slices)\n",a,b,b*c);

        System.out.printf("Each person gets %d pieces of pizza.\n",quo);
        System.out.printf("There are %d leftover pieces.",remain);

    }

}
