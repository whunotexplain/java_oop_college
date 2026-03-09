package laba_1.dop_problems;

import java.util.Scanner;

public class variant_9 {
    public static void main(String[] args) {
        Scanner IntegerInput = new Scanner(System.in);

        System.out.println("Введите номер месяца");
        int month_number = IntegerInput.nextInt();

        if (month_number == 3 || month_number == 4 || month_number == 5) {
            System.out.println("Spring");
        } else if (month_number == 6 || month_number == 7 || month_number == 8) {
            System.out.println("Summer");
        } else if (month_number == 9 || month_number == 10 || month_number == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }
}