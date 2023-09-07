package practise;

import java.math.BigDecimal;;

public class Simpleinterset {
    private BigDecimal principal;
    private BigDecimal interest;

    Simpleinterset(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }

    BigDecimal amount_calculator(int no_of_years){
        BigDecimal total_interest = principal.multiply(interest.multiply(new BigDecimal(no_of_years)));
        BigDecimal total_rate = total_interest.divide(new BigDecimal(100));
        BigDecimal total_amount = total_rate.add(principal);
        return total_amount;
    }
    
}
