package laba_1.dop_problems;

import java.util.Scanner;

public class variant_1 {
    public static void main(String[] args) {
        Scanner InputNumber = new Scanner(System.in);

        System.out.print("Enter number a ");
        double a = InputNumber.nextDouble();

        System.out.print("Enter number b ");
        double b = InputNumber.nextDouble();

        double answer = a % b;
        System.out.println("Answer equals " + answer);
    }
}