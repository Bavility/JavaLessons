// Написать программу, которая определяет, содержит ли массив заданное с клавиатуры число.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите размер массива: ");
    int n = scanner.nextInt();

    int[] array = new int[n];

    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < n; i++) {
    array[i] = scanner.nextInt();
    }

    System.out.println("Введите число, которое вы хотите найти в массиве: ");
    int number = scanner.nextInt();

    boolean con = false;

    for (int i = 0; i < n; i++) {
    if (array[i] == number) {
    con = true;
    break;
    }
    }

    // Выводим результат
    if (con) {
    System.out.println("Число " + number + " содержится в массиве.");
    } else {
    System.out.println("Число " + number + " не содержится в массиве.");
}
}
}

/*
Эта программа сначала запрашивает у пользователя размер массива, а затем вводит элементы массива.
Затем программа запрашивает у пользователя число, которое нужно найти, и проверяет, содержится ли это число в массиве.
Если число содержится в массиве, программа выводит сообщение "Число содержится в массиве".
В противном случае программа выводит сообщение "Число не содержится в массиве".
 */
