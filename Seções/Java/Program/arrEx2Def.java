package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.arrEx2;

public class arrEx2Def {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<arrEx2> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id taken. Try another");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            arrEx2 emp = new arrEx2(id, name, salary);

            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        arrEx2 emp2 = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp2 == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp2.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (arrEx2 x : list) {
            System.out.println(x);
        }

        sc.close();
    }

    public static boolean hasId(List<arrEx2> list, int id) {
        arrEx2 emp3 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp3 != null;
    }
}
