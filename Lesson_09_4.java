/*
Реализуйте программу, которая возводит число в степень
без использования встроенной функции Math.pow().
Попробуйте реализовать алгоритм быстрого возведения в степень
для улучшения эффективности.
 */

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scan = new Scanner(System.in);

    int result=1;
    System.out.println("Введите число: ");
    int number= scan.nextInt();

    System.out.println("Введите степень: >= 0");
    int exponent=scan.nextInt();
    
    // Уведомление об ошибке
    if(exponent < 0){
    System.err.println("Степень не должна быть отрицательной");
    }

    else {
    for (int i = 0; i < exponent; i++) {
    result *= number;
    }

    // Выводим результат
    System.out.printf("%d", result);
}
}
}
