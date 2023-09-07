package calculator;

import java.util.Scanner;

public class Calculator_using_switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1:- ");
        int number1 = input.nextInt();
        System.out.println("Enter Number 2 :- ");
        int number2 =input.nextInt();
        System.out.println("Choices Available are");
        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.println("Enter Choices:- ");
        int choice = input.nextInt();
        System.out.println("Your choices are :- ");
        System.out.println("Number 1 "+number1);
        System.out.println("Number2 "+number2);
        System.out.println("Choice "+choice);
        perform_operations(number1, number2, choice);  // calling method perform_operations
    }
    private static void perform_operations(int number1, int number2, int choice){
        switch(choice){
            case 1 : System.out.println("Result "+(number1+number2)); 
                break;
            case 2 : System.out.println("Result " + (number1-number2)); 
                break;
            case 3 : System.out.println("Result "+(number1/number2)); 
                break;
            case 4 : System.out.println("Result " + (number1*number2)); 
                break;
            default : System.out.println("Invalid operations");   // default is similar to else
                break;
        }
    }
}
