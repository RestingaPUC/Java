package Program;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.arrayExercise;

public class arrayExerciseDef {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        arrayExercise[] xyz = new arrayExercise[10];

        System.out.printf("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.printf("Rent #%d: %n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            xyz[room] = new arrayExercise(name, email, room);
        }
        System.out.println(Arrays.toString(xyz));
        
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (xyz[i] != null) {
                System.out.println(i + ": " + xyz[i]);
            }
        }
        sc.close();
    }
}
