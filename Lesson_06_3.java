// Написать программу, которая принимает на вход число n и выводит все простые числа до n.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  
    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число: ");
    int numberInt = scanner.nextInt();

    if(numberInt <= 0){
        System.err.println("Число должно быть положительным");
    }
    else {

    for (int i=2; i<numberInt-1; i++){
    boolean result = true;
    for (int y=2; y <= 1+i/2; y++ ){
    if(i % y == 0){
    result = false;
    break;
    }
    }
    
    if(result){
    System.out.printf("%d ", i);
    }
    }
    }

    //#2
    int checkNumber;
    boolean result=true;

    for (int i=2; i<=numberInt/2; i++) {
    checkNumber = numberInt % i;
    if (checkNumber == 0) {
    result = false;
    break;
    }
    //TODO Вывод чисел на экран
    }
    if(result) {
    System.out.println(numberInt + " - простое число");
    } else {
    System.out.println(numberInt + " - составное число");
}
}
}
