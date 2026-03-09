package laba_1.dop_problems;

import java.util.Scanner;

public class variant_4 {
    public static void main(String[] args) {
        Scanner IntegerInput = new Scanner(System.in);

        System.out.println("Введите номер x");
        int x = IntegerInput.nextInt();

        System.out.println("Введите номер y");
        int y = IntegerInput.nextInt();

        System.out.println("[" + x + ";"+  y + "]");

        System.out.print("Четные числа: ");
        for(int i = x; i <= y; i++){
            if(i % 2 == 0){
                System.out.println("Четные = " + i);
            } else if (i % 2 != 0) {
                System.out.println("Не Четные = " + i);
            }
        }
    }
}