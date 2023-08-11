// Написать программу, которая определяет, является ли массив строго возрастающим.

public class Main {
public static void main(String[] args) {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
    boolean result = false; 
  
    for (int i = 0; i < numbers.length - 1; i++) {
    if (numbers[i] >= numbers[i + 1]) {
    
    } else {
    result = true;  
    break;
    }
    }
    
    // Выводим результат
    if (result) {
    System.out.println(result);
    } else {
    System.out.println(result);
    }

    int[] aray= new int[]{1, 2, 3, 4 ,5};
    int length=aray.length;
    boolean resultCheck=true;
  
    for(int i=1;i<=length-1;i++)
    {
    if((aray[i]-aray[i-1])<0)
    {
    resultCheck = false;
    break;
    }
    }
    
    // Выводим результат
    System.out.println(resultCheck);
}
}
