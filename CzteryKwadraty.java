//Bartlomiej Kleszczewski lab2 
import java.util.Scanner;
import java.util.ArrayList;

//przedzial od 
public class CzteryKwadraty {
    public static void main(String[] args) {
        int dolnaGranica;
        int gornaGranica;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Podaj dolna granice: ");
            dolnaGranica = scan.nextInt();

            System.out.println("Podaj gorna granice: ");
            gornaGranica = scan.nextInt();

            if (dolnaGranica >= gornaGranica) {
                System.out.println("Błędne dane! dolna granica musi być mniejsza od gornej");
            }
        }
        znajdzCzteryKwadraty(dolnaGranica, gornaGranica);
    }

    public static void znajdzCzteryKwadraty(int a, int b) {
        ArrayList<Integer> nieMaBezZera = new ArrayList<>();

        for (int num = a; num <= b; num++) {
            ArrayList<Integer> kwadraty = znajdzKwadraty(num);
            if (!kwadraty.isEmpty()) {
                System.out.print("Rozklad liczby " + num + " na cztery kwadraty: ");
                for (int kwadrat : kwadraty) {
                    System.out.print(kwadrat + " ");
                }
                System.out.println();
            } else {
                nieMaBezZera.add(num);
            }
        }
        System.out.println("Liczby z przedzialu dla ktorych nie ma rozkladu na liczby naturalne bez zera: ");
        for (int num : nieMaBezZera) {
            System.out.println(num);
        }
    }

    public static ArrayList<Integer> znajdzKwadraty(int liczba) {
        ArrayList<Integer> kwadraty = new ArrayList<>();
        // petla sprawdza wszystkie mozliwe rozklady na 4 kwadraty i przyrownuje do
        // liczby
        for (int i = 0; i * i <= liczba; i++) {
            for (int j = i; j * j <= liczba; j++) {
                for (int k = j; k * k <= liczba; k++) {
                    for (int l = k; l * l <= liczba; l++) {
                        if (i * i + j * j + k * k + l * l == liczba) {
                            kwadraty.add(i);
                            kwadraty.add(j);
                            kwadraty.add(k);
                            kwadraty.add(l);
                            
                            return kwadraty;
                        }
                    }
                }
            }
        }
        return kwadraty; // zwraca pusta liste
    }
}
