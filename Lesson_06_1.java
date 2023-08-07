// Написать программу, которая принимает на вход число и выводит его в обратном порядке. 11223344-->44332211

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  
    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner input = new Scanner(System.in);
  
    System.out.print("Введите число: ");
    String numberString = input.nextLine();
  
    // Выводим результат
    int lengthOfNumber = numberString.length();
    System.out.print("Число в обратном порядке: ");
  
    for (int i = lengthOfNumber-1; i >=0; i--){
    System.out.print(numberString.charAt(i));

   // Закрываем объект Scanner
   input.close();
}
}
}