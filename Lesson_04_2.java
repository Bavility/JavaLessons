/* 
Напишите программу, которая принимает строку. Если строка равна "Привет", программа должна ответить "Привет!". Если строка равна "Пока", программа должна ответить "До встречи!". 
Если строка не равна ни одному из этих вариантов, программа должна ответить "Я вас не понимаю". Реализуйте это с помощью switch-case и if-else.
*/

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    String greet;
    String answer = "Я вас не понимаю";

    System.out.print("Введите слово");
    greet = scanner.next();

    switch (greet) {
    case "Привет"-> answer = "Привет";
    case "Пока"-> answer = "До встречи!";

    default -> System.err.println(Ошибка!");

    }
    System.out.println(answer);

}
}