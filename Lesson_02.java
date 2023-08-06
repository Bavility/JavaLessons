/*
Создайте две переменные типа String, firstName и lastName. Присвойте им ваши имя и фамилию. 
Создайте третью переменную fullName и используйте эти две переменные, чтобы создать полное имя."
*/

public class Main {
public static void main(String[] args) {
    
    String firstName = "Sergejs ";
    String lastName = "Zubakins";
    String fullName = firstName + lastName;
    
    System.out.println(fullName); // Выводит "Sergejs Zubakins"
}
}

/*
В этом примере мы объявляем две переменные типа String - firstname и lastname, и присваиваем им значения "Sergejs" и "Zubakins" соответственно. 
Затем мы создаем третью переменную fullname и используем оператор конкатенации "+" для объединения значений firstname и lastname с пробелом между ними. 
Результат сохраняется в fullname. Наконец, мы выводим fullname на консоль, и должны получить "Sergejs Zubakins".
*/
