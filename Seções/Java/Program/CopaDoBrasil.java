package Program;

import java.util.Scanner;

public class CopaDoBrasil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String campeao;
        int tamMax = 1992 - 1989 + 1;
        String[] clubes = new String[tamMax];
        int[] titulos = new int[tamMax];
        int numClubes = 0;
        for (int i = 1989; i <= 1992; ++i) {
            System.out.print("Campeao de " + i + "? ");
            campeao = in.nextLine();
            boolean achou = false;
            for (int j = 0; j < numClubes; ++j) {
                if (campeao.equals(clubes[j])) {
                    titulos[j]++;
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                clubes[numClubes] = campeao;
                titulos[numClubes] = 1;
                ++numClubes;
            }
        }
        int maisTitulos = titulos[0];
        for (int i = 1; i < numClubes; ++i) {
            if (titulos[i] > maisTitulos)
                maisTitulos = titulos[i];
        }
        for (int i = 0; i < numClubes; ++i) {
            if (titulos[i] == maisTitulos)
                System.out.println(clubes[i] + ": " + titulos[i] + " titulos");
        }
    }
}
