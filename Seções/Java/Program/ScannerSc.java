package Program;

import java.util.Scanner;

public class ScannerSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String x; para texto 
        //x = sc.next(); quando for utilizado String x obs.: imprimi uma única palavra

        //int x; para números inteiros
        //x = sc.nextInt(); quando for utilizado int x

        //double x; para double
        //x = sc.nextDouble(); quando for utilizado double

        //char x; para char
        /*x = sc.next().charAt(0); quando for utilizado charAt(0) 
        para imprimir a primeira letra digitada */

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
        
    }
    
}
