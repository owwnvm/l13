import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания (1-2)");
        int a = in.nextInt();
        switch (a) {
            case 1:
                int size = 3;
                int[] arr = new int[size];
                int[] arr2 = new int[size];
                Task1 t = new Task1();
                arr = t.Task1_MakeArr(size);
                t.Task1_PrintArr(arr);
                arr2 = t.Task1_MakeArr(size);
                t.Task1_Rand(arr, arr2);
                break;
            case 2:
                Person person = new Person("Name", 20, 164.9, 49.3);
                person.walk();
                person.say("you are so dum dum dududu dumb");
                System.out.println();
                person.setAge(20);
                System.out.println(person.dob());
                break;
        }
    }
}
