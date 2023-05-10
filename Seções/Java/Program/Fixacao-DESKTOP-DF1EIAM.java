package Program;

import java.util.Locale;

public class Fixacao {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US); 

    String product1 = "Computer";
    String product2 = "Office desk";
    int age = 30; 
    int code = 5290;
    char gender = 'F';
    double price1 = 2100;
    double price2 = 650.50;
    double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf(product1 + ", which price is $%.2f%n", price1);
        System.out.printf(product2 + ", which price is $%.2f%n", price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("%.8f%n", measure);
        System.out.printf("%.3f%n", measure);
    }   
    
}
