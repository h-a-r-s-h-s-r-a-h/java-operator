package bigdecimalnew;
import java.math.BigDecimal;
import java.util.Scanner;

public class Bigdecimal_final {
    private BigDecimal principal;
    private BigDecimal rate;
    Bigdecimal_final(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(interest);
    }
    
    void final_value(int no_of_years){
        BigDecimal final_interest = principal.multiply(rate.multiply(new BigDecimal(no_of_years).divide(new BigDecimal(100))));
        BigDecimal final_amount = final_interest.add(principal);
        System.out.printf("%.2f",final_amount);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String principal = input.next();
        String rate = input.next();
        int time = input.nextInt();
        Bigdecimal_final definite = new Bigdecimal_final(principal, rate);
        definite.final_value(time);
    }
}
