package bigdecimalpractise;

import java.math.BigDecimal;

public class Simpleinterestcalculator {
    BigDecimal principal;
    BigDecimal interest;
    Simpleinterestcalculator(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }
    BigDecimal calculatetotalvalue(int no_of_years){
        BigDecimal no_of_years_bigdecimal = new BigDecimal(no_of_years);
        BigDecimal total_interest = principal.multiply(interest).multiply(no_of_years_bigdecimal).divide(new BigDecimal(100));
        BigDecimal total_amount = total_interest.add(principal);
        return total_amount;
    }
}
