package bigdecimalpractise;

import java.math.BigDecimal;

public class Printerofamount {
    public static void main(String[] args){
        Simpleinterestcalculator calculator = new Simpleinterestcalculator("4500.00", "7.5");
        BigDecimal final_value = calculator.calculatetotalvalue(5);
        System.out.println(final_value);
    }
}
