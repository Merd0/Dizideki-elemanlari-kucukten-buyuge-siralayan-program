import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz :");
        int n = inp.nextInt();
        System.out.println("Dizinin elemanlarını giriniz :");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". Elamanı : " + arr[i]);

        }
    }
}