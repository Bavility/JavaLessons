// Написать программу, которая возвращает сумму всех элементов массива.

public class Main {
public static void main(String[] args) {
  
    int[] array = {5, 10, 15, 20, 25};

    int sum = 0;

    for (int i=0; i< array.length; i++) {
    sum += array[i]; 
    }
  
    // Выводим результат
    System.out.println("Сумма всех элементов массива: " + sum);
}
}
