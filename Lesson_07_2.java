// Напишите программу, которая принимает число N и вычисляет сумму всех чисел от 1 до N, используя цикл. Пример:вводится число 10. На консоль выводится (10+9+8+7+6+5+4+3+2+1): "Сумма чисел 55"

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner input = new Scanner(System.in);

    // Ввод числа n
    System.out.print("Введите число n: ");
    int n = input.nextInt();
    int sum = 0;

    // Цикл для суммирования чисел от 1 до n
    for (int i = 1; i <= n; i++) {
    sum += i;
    }

    // Выводим результат
    System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);

    // Закрываем объект Scanner
    input.close();
}
}
