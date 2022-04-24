package For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.println("Сколько вам лет?");
            int age = new Scanner(System.in).nextInt();
        for (int i = age; i <= 18; i++){
            System.out.println(i);
        }

    }
}
