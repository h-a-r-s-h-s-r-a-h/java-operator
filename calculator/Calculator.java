package calculator;

import java.util.Scanner;

public class Calculator {
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
        if(choice==1){
            System.out.println("Result "+(number1+number2));
        }else if(choice==2){
            System.out.println("Result "+(number1-number2));
        }else if(choice==3){
            System.out.println("Result "+(number1 / number2));
        }else if(choice==4){
            System.out.println("Result "+(number1*number2));
        }else{
            System.out.println("Invalid opretions");
        }
        

    }
    
}
