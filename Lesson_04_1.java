// Напишите программу, которая использует switch-case, чтобы реализовать простой калькулятор. Программа должна принимать два числа и операцию (+, -, *, /, ^), а затем выполнять эту операцию и выводить результат.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int numberOne = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int numberTwo = scanner.nextInt();

    System.out.print("Укажите операцию (+, -, *, /: ");
    String operation = scanner.next();

    int result= 999;

    switch (operation) {
    case "+":
    result = numberOne + numberTwo;
    break;

    case "-":
    result = numberOne - numberTwo;
    break;

    case "*":
    result = numberOne * numberTwo;
    break;

    case "/":
    if (numberTwo != 0) {
    result = numberOne / numberTwo;
    break;

    } else {
    System.err.println("Деление на 0");
    break;
    }

    // Уведомление об ошибке
    default:
    System.err.println("Что-то пошло не так!");
    break;
    }

    // Выводим результат
    if(result != 999) {
    System.out.println("Результат: " + result);
}
