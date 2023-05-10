package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.currencyConverter;

public class currencyConverterDef {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dollar price: ");
        currencyConverter.dollar = sc.nextDouble();

        System.out.print("Amount desired: ");
        currencyConverter.desired = sc.nextDouble();

        double result = currencyConverter.paid();
        System.out.printf("Amount to be paid in reais: %.2f", result);

        sc.close();

    }
    
}
