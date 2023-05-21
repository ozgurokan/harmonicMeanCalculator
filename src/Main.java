import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n; // eleman sayısı
        double harmonicSum = 0, element, result; // harmonik toplam, eleman, sonuç

        // kullanıcıdan dizinin boyut bilgisi alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Dizideki eleman sayısı: ");
        n = input.nextInt();

        // her elemanla bölme işlemi yapılacağı için double türünde bir liste tanımlanır
        double[] list = new double[n];

        // kullanıcının girdiği dizi boyutu kadar dönecek bir döngü açılır ve her seferinde kullanıdan eleman istenir.
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". indeksteki eleman: ");
            list[i] = input.nextInt();
        }

        // dizideki bütün elemanlar gezilir ve her bir eleman harmonicSum değişkenine 1/eleman şeklinde eklenir
        for (double i : list) {
            harmonicSum += 1 / i;
        }

        // sonuç hesaplanır ve kullanıcıya çıktı verilir
        result = n / harmonicSum;
        System.out.println("Dizinin Harmonik Ortalaması: " + result);
    }
}