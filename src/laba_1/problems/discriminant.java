package laba_1.problems;

import java.util.Scanner;
import java.lang.Math;

public class discriminant {
    public static void main(String[] args) {
        // D = b**2 - 4*a*c
        Scanner InputNumber = new Scanner(System.in);

        System.out.print("Enter number a ");
        double a = InputNumber.nextDouble();

        System.out.print("Enter number b ");
        double b = InputNumber.nextDouble();

        System.out.print("Enter number c ");
        double c = InputNumber.nextInt();

        double disc = b*b - 4*a*c;

        if (disc > 0) {
            double x_1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x_2 = (-b - Math.sqrt(disc)) / (2 * a);

            System.out.println("X1 equals " + x_1 + " X2 equals " + x_2);
        } else {
            System.out.println("Discremenant not countable");
        }
    }
}