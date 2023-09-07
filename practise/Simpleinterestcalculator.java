package practise;

import java.math.BigDecimal;

public class Simpleinterestcalculator {
    public static void main(String[] args){
        Simpleinterset calculator = new Simpleinterset("4500.00", "7.5");
        BigDecimal total_print_amount = calculator.amount_calculator(5);
        System.out.println(total_print_amount);
    }
}
