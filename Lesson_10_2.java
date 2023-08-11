/*
Написать программу, которая возвращает обратный массив. int[]{1, 2, 3, 4, 5}
вернет {5, 4, 3, 2, 1}.
С клавиатуры массив вводить не надо.
*/

public class Main {
public static void main(String[] args) {

    int [] array = new int[]{1,2,3,4,5};
    int [] arrayNew = new int [5];
    int length = array.length;
  
    for (int i=0;i<=length-1;i++)
    {
    arrayNew[i]=array[length-1-i];
    //System.out.printf("%d ",arrayNew[i]);
    }

    int [] massiv;
    massiv= new int[8];
    massiv = new int[]{5, 4, 3, 2, 2, 1};
    for (int i = massiv.length - 1; i >= 0; i--) {
    
    System.out.print(massiv[i] + " ");
}
}
}
