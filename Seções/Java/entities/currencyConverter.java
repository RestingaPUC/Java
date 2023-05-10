package entities;

public class currencyConverter {
    public static double dollar;
    public static double desired;

    public static double paid() {
        return dollar * desired * 1.06;
    }
}
