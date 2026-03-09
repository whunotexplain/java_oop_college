package laba_1.dop_problems;

import java.util.Scanner;

public class variant_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                days = 28;
                break;

            default:
                days = -1;
                System.out.println("Ошибка: неверный номер месяца!");
                return;
        }

        System.out.println("Количество дней в месяце " + month + " = " + days);
    }
}
