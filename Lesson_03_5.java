/* 
Создайте программу для книжного магазина, которая проверяет, есть ли книга на складе и доступна ли она для покупки. 
Пусть у каждой книги будет boolean переменная inStock, которую можно проверить при принятии решения о покупке.
*/

public class Main {
public static void main(String[] args) {

    String book = "Restrukt"; 
    int quantityBookRestrukt = 14; // Замените значение на своё
    boolean inStock = quantityBookRestrukt > 0;
    
    // Выводим результат
    if(inStock == true){
    System.out.println("Книга " + book + " есть в наличии в количестве " + quantityBookRestrukt + " штук");
    } else {
    System.out.println("Книга " + book + " нет в наличии");
}
}
}

/*
В этом примере у книги есть название ("Restrukt") и переменная `inStock`, которая указывает, есть ли книга на складе и доступна ли она для покупки. 
Если книга доступна, выводится соответствующее сообщение, в противном случае выводится сообщение о ее отсутствии на складе или недоступности для покупки.
*/
