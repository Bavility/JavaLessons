// Напишите программу, которая находит минимальную и максимальную цифру в числе введенном с клавтатуры используя циклы. Пример: вводится число 5987. На консоль выводится: "минимальная цифра 5, максимальная 9".

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner input = new Scanner(System.in);

    System.out.print("Введите число: ");
    int num = input.nextInt();

    // Инициализируем переменные для минимальной и максимальной цифры
    int min = num % 10;
    int max = num % 10;

    // Проверяем каждую цифру числа
    while (num > 0) {

    // Получаем последнюю цифру числа
    int end = num % 10;

    // Сравниваем ее с текущими минимальной и максимальной цифрами
    if (end < min) {
    min = end;
    }
    if (end > max) {
    max = end;
    }

    // Удаляем последнюю цифру числа
    num /= 10;
    }

    // Выводим результаты
    System.out.println("Минимальная цифра: " + min);
    System.out.println("Максимальная цифра: " + max);

    // Закрываем объект Scanner
    input.close();
}
}
