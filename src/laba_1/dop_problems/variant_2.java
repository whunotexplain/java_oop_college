package laba_1.dop_problems;

import java.util.Scanner;

public class variant_2 {
    public static void main(String[] args) {
        // Вариант 2 и 3 объединены

        Scanner InputNumber = new Scanner(System.in);

        System.out.println("Enter number_1 ");
        int number_1 = InputNumber.nextInt();

        System.out.println("Enter number_2 ");
        int number_2 = InputNumber.nextInt();

        if (number_1 > number_2) {
            System.out.println("Maximal number equal to " + number_1);
            System.out.println("Minimal number equal to " + number_2);
        } else {
            System.out.println("Maximal number equal to " + number_2);
            System.out.println("Minimal number equal to " + number_1);
        }
    }
}