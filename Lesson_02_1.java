/* 
Создайте переменную age типа int и присвойте ей значение вашего возраста. Напишите условный оператор if, который проверяет, является ли значение age больше или равно 18. 
Если это так, выведите "Вы совершеннолетний", в противном случае выведите "Вы несовершеннолетний".
*/

public class Main {
public static void main(String[] args) {
     
    int age = 28;
    int young_age = 17;
     
    if(age >= young_age) {
    System.out.println("Вы совершеннолетний");
    } else {
    System.out.println("Вы несовершеннолетний");
}
}
}
