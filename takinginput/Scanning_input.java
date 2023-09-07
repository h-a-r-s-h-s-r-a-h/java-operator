package takinginput;

import java.util.Scanner;

public class Scanning_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value");
        int number = input.nextInt();  // for taking input of integers
        System.out.println("the entered integer is - " + number);

        System.out.println("Enter String:-");
        String str = input.next(); // for taking inputs of String
        System.out.println("The entered string is :- " + str);

    }

}
