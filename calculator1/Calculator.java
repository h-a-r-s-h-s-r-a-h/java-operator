package calculator1;

public class Calculator {

    private int number1;
    private int number2;

    Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    void choice(int choice){
        if(choice==1){
            System.out.println("Result :- "+(number1 + number2));
        } else if(choice==2){
            System.out.println("Result :- "+ (number1 - number2));
        } else if(choice == 3){
            System.out.println("Result :- "+(number1 / number2));
        }else if(choice == 4){
            System.out.println("Result :- "+(number1 * number2));
        }else{
            System.out.println("Invalid operation");
        }
    }
    
}
