package calculator1;

import java.util.Scanner;

public class Runner_calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:-");
        int number1 = input.nextInt();
        System.out.println("Enter number 2:-");
        int number2 = input.nextInt();
        System.out.println("Choices Available are :-");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("Enter Choice :-");
        int choice = input.nextInt();
        Calculator calculate = new Calculator(number1, number2);
        calculate.choice(choice);
    }
}
