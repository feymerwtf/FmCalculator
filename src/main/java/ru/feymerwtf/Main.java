package ru.feymerwtf;

import java.util.Scanner;

public class Main {

    public static int oneNumber;
    public static int twoNumber;
    public static double result;
    public static String operation;

    public static void main(String[] args) {
        System.out.println("Приложение было запущено!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите 1 число.");
        try {
            oneNumber = scanner.nextInt();
            scanner.nextLine();
        } catch (NumberFormatException exception) {
            System.err.println("\nНеобходимо ввести число!");
            return;
        }

        System.out.println("\nВведите 2 число.");
        try {
            twoNumber = scanner.nextInt();
            scanner.nextLine();
        } catch (NumberFormatException exception) {
            System.err.println("\nНеобходимо ввести число!");
            return;
        }

        System.out.println("\nВведите операцию, которую необходимо произвести. (+, -, *, /)");
        operation = scanner.nextLine();

        if (operation.equalsIgnoreCase("+")) {
            result = oneNumber + twoNumber;
        } else if (operation.equalsIgnoreCase("-")) {
            result = oneNumber - twoNumber;
        } else if (operation.equalsIgnoreCase("*")) {
            result = oneNumber * twoNumber;
        } else if (operation.equalsIgnoreCase("/")) {
            if (twoNumber == 0) {
                System.err.println("\nНа 0 делить нельзя!");
                return;
            } else {
                result = (double) oneNumber / twoNumber;
            }
        } else {
            System.err.println("\nВы ввели неверную операцию.");
        }

        System.out.println("\nРезультат: " + result);
        scanner.close();
    }
}