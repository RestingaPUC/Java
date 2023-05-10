package Program;

import java.util.Scanner;

public class ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // modelo if-else
        /*
         * double preco = 34.5;
         * double desconto;
         * if (preco < 20.0) {
         * desconto = preco * 0.1;
         * } else {
         * desconto = preco * 0.05;
         * }
         */

        // modelo alternativo
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("%.2f", desconto);

        sc.close();
    }

}
