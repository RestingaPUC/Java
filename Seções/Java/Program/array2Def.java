package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.array2;

public class array2Def {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        array2[] vect = new array2[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new array2(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum+= vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Average price = %.2f%n", avg);
        
        sc.close();
    }
}
