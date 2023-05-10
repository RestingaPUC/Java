package App;

public class Program {
    public static void main(String[] args) {
        
        Client c1 = new Client("Mario", "mario@gmail.com");
        Client c2 = new Client("Mario", "mario@gmail.com");

        String st1 = "sdfgf";
        String st2 = "sdfgf";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c2.equals(c1));
        System.out.println(c1 == c2);
        System.out.println(st1 == st2);
    }
}
