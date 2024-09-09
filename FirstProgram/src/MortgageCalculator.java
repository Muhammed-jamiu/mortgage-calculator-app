import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner hashi = new Scanner(System.in);
        double r;
        double n;
        System.out.println("Principal: ");
        int p = hashi.nextInt();

        System.out.println("Annual interest Rate: ");
        double annualInterestRate = hashi.nextDouble();

        System.out.println("Enter Period (Years) :");
        byte years = hashi.nextByte();
        r = ((annualInterestRate /100) / 12);
        n = years * 12 ;
       double mortgage = (p * (r * Math.pow((1 + r ),n)))/Math.pow((1 + r),n);
       String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage: " + mortgageFormatted);

    }
}