package IfElse;

import java.util.Objects;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("77+33=100?");
        String str = new Scanner(System.in).nextLine();
        if (Objects.equals(str,"Да")){
            System.out.println("Неверно");
        }else if (Objects.equals(str,"Нет")){
            System.out.println("Верно");
        }else System.out.println("Отвечай только Да или Нет");
    }
}
