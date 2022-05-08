package Tasks;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a % 2 == 0) {
            System.out.println("Ваше число четное");
        }
        if (a % 2 != 0) {
            System.out.println("Ваше число нечетное");
        }
    }
}
