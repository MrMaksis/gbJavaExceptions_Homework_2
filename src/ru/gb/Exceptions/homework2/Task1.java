package ru.gb.Exceptions.homework2;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введенное число: " + getFloatInput());
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);

        float number = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }

        return number;
    }
}
