import java.util.ArrayList;
import java.util.Scanner;

public class Drabinka {
    public static void main(String[] args) {
        int liczbaZawodnikow;
        System.out.println("Podaj liczbe zawodnikow, ktora jest potega 2");
        Scanner scanner = new Scanner(System.in); 
        while (true) {
            liczbaZawodnikow = scanner.nextInt(); 
            if (czyPotegaDwojki(liczbaZawodnikow)) {
                break; 
            }
            System.out.println("Podana liczba nie jest potęga 2:");
        }
        scanner.close(); 
        utworzDrabinke(liczbaZawodnikow);
    }

    public static void utworzDrabinke(int liczbaZawodnikow) {
        ArrayList<Integer> drabinka = new ArrayList<>();
        for (int i = 1; i <= liczbaZawodnikow; i++) {
            drabinka.add(i);
        }

        wypiszPary(drabinka);
    }

    public static void wypiszPary(ArrayList<Integer> drabinka) {
        int polowa = drabinka.size() / 2;
        for (int i = 0; i < polowa; i++) {
            System.out.println(drabinka.get(i) + " - " + drabinka.get(drabinka.size() - 1 - i));
        }
    }

    public static boolean czyPotegaDwojki(int liczba) {
        return (liczba & (liczba - 1)) == 0;
    }
}
