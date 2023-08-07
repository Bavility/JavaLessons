// Напишите программу, которая выводит строку в обратном порядке. Ваша программа должна пройти по всей строке с конца до начала и вывести её на экран.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    System.out.print("Напишите что-нибудь: ");
    String obrt = scanner.nextLine();

    for (int i = obrt.length() - 1; i >= 0; i--) {

    // Выводим результат
    System.out.print(obrt.charAt(i));
}
}
}

/*
Программа сначала просит пользователя написать что-нибудь, а затем проходит по каждому символу строки в обратном порядке, начиная с последнего символа, и выводит его на экран.
 */
