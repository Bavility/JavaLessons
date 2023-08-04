// Написать программу, которая принимает на вход число и выводит сумму его цифр.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner input = new Scanner(System.in);

    System.out.print("Введите число: ");
    int number = input.nextInt();

    int sum = 0;
    int digit;
    
    while (number != 0) {
    digit = number % 10; // получаем последнюю цифру числа
    sum += digit; // добавляем цифру к сумме
    number /= 10; // удаляем последнюю цифру числа
    }

    // Выводим результат
    System.out.println("Сумма цифр числа: " + sum);

    // Закрываем объект Scanner
    input.close();
}
}
