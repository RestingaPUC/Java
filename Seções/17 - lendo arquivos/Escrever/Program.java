package Escrever;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        
        String[] lines = {"Good morning", "Good afternoon", "Good evening"};

        String path = "C:\\Users\\carne\\OneDrive\\Área de Trabalho\\xx.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
