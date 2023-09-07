package stringoperation;
import java.time.*;
//import java.time.Month;
//import java.time.temporal.ChronoField;
import java.util.Scanner;

public class String_operation {

	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    int a1 = input.nextInt();
		Month month = Month.of(a1);
		String mon = String.valueOf(month);
		int len = mon.length();
		String n1 =mon.substring(0,1);
		String n2=mon.substring(1,len);
		String n3 = n2.toLowerCase();
		System.out.println(n1+n3);
	}
}


