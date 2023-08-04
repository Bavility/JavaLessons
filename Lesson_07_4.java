// Напишите программу, которая рисует ромб из звездочек заданной высоты. Высоту ромба вводит пользователь.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner input = new Scanner(System.in);

    System.out.print("Введите высоту ромба: ");
    int height = input.nextInt();

    // Верхняя половина ромба
    for (int i = 1; i <= height; i++) {
    for (int j = 1; j <= height - i; j++) {
    System.out.print("  "); // Выводим пробелы перед звездочками
    }

    for (int k = 1; k <= i; k++) {
    System.out.print("* "); // Выводим звездочки
    }

    System.out.println(); // Переходим на новую строку
    }

    // Нижняя половина ромба
    for (int i = height - 1; i >= 1; i--) {
    for (int j = 1; j <= height - i; j++) {
    System.out.print("  "); // Выводим пробелы перед звездочками
    }

    // Выводим звездочки
    for (int k = 1; k <= i; k++) {
    System.out.print("* ");
    }

    // Переходим на новую строку
    System.out.println();
    }

    // Закрываем объект Scanner
    input.close();
}
}
