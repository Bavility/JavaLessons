// Создайте программу для книжного магазина, которая проверяет, есть ли книга на складе и доступна ли она для покупки. Пусть у каждой книги будет булева переменная inStock, которую можно проверить при принятии решения о покупке.

public class main {
public static void main(String[] args) {

    String book = "Restrukt";
    int quantityBookRestrukt = 14;
    boolean inStock = quantityBookRestrukt > 0;

    if(inStock == true){
    System.out.println("Книга " + book + " есть в наличии в количестве " + quantityBookRestrukt + " штук");
    } else {
    System.out.println("Книга " + book + " нет в наличии");
}
}
}
