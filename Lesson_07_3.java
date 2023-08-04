/*
Напишите программу, которая принимает от пользователя последовательность чисел (количество заранее не известно) и вычисляет их среднее значение. 
Пользователь сам определяет когда будет остановлен ввод чисел и выведено среденнее значение для уже введенных, введя 000. 
Пример: Пользователь вводит с клавиатуры "10", "20", "30", "000". Ввод в консоль: "Среднее значение 20"
*/

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int count = 0;

    System.out.println("Введите числа: "); // введите 000 для остановки

    while (true) {
    String input = scanner.nextLine();

    if (input.equals("000")) {
    break;
    }

    int number = Integer.parseInt(input);
    sum += number;
    count++;
    }

    // Вычисляем среднее значение
    double average = (double) sum / count;
    System.out.println("Среднее значение: " + average);

    // Закрываем объект Scanner
    scanner.close();
}
}
