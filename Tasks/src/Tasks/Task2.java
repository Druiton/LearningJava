package Tasks;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите математическую операцию, которую вы хотите совершить");
        String str = new Scanner(System.in).nextLine();
        System.out.println("Введите второе число");
        int b = new Scanner(System.in).nextInt();
        if (Objects.equals(str, "+")) {
            System.out.println(a + b);
        }
        if (Objects.equals(str, "*")) {
            System.out.println(a * b);
        }
        if (Objects.equals(str, "-")) {
            System.out.println(a - b);
        }

    }
}