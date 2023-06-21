import java.util.Random;
import java.util.Scanner;

public class Task1 {
    Scanner scan = new Scanner(System.in);

    public Task1() {
        this.scan = new Scanner(System.in);
    }

    public  int[] Task1_MakeArr(int size) {
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i) {
            System.out.println("Введите число:");
            arr[i] = this.scan.nextInt();
        }

        return arr;
    }

    public void Task1_PrintArr(int[] arr) {
        System.out.println("Ваш массив:");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public void Task1_Rand(int[] arr, int[] brr) {
        Random rand = new Random();
        int k = 0;
        System.out.println("\nРандомное число массива:");

        int i;
        for( i = 0; i < arr.length; ++i) {
            for(int j = 0; j < brr[i]; ++j) {
                ++k;
            }
        }

        int[] crr = new int[k];

        for(i = 0; i < arr.length; ++i) {
            for(int j = 0; j < brr[i]; ++j) {
                crr[j] = arr[i];
                System.out.print(crr[j] + " ");
            }
        }

        i = rand.nextInt(crr.length);
        System.out.println("\nРандомное число: " + crr[i]);
    }
}
