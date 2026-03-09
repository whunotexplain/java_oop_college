package laba_1.dop_problems;

import java.util.Scanner;

public class variant_7 {
    public static void main(String[] args) {
        Scanner IntegerInput = new Scanner(System.in);

        System.out.println("Введите номер x");
        int x = IntegerInput.nextInt();

        System.out.println("Введите номер y");
        int y = IntegerInput.nextInt();

        System.out.println("Введите номер z");
        int z = IntegerInput.nextInt();

        System.out.println("[ " + x + ";" + y + "]");

        if (z >= x && z <= y) {
            System.out.println("x в промежутке");
        } else {
            System.out.println("x не в промежутке");
        }
    }
}