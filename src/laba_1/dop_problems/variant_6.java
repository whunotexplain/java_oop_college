package laba_1.dop_problems;

import java.util.Scanner;

public class variant_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();

        if (y == 0) {
            System.out.println("Деление на ноль!");
        } else {
            double result = x / y;
            System.out.println("x / y = " + result);
        }
    }
}