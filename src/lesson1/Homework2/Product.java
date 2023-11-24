/* *Задание 2. (необязательное) *
Мы хотим улучшить функциональность нашего интернет-магазина.
Ваша задача - добавить два новых метода в класс Shop: Метод
sortProductsByPrice(), который сортирует список продуктов по стоимости.
Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
(правильное количество продуктов, верное содержимое корзины).
Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
Напишите тесты для проверки корректности работы метода sortProductsByPrice
(проверьте правильность сортировки). Используйте класс Product для создания
экземпляров продуктов и класс Shop для написания методов сортировки и тестов.
*/

package lesson1.Homework2;

public class Product {
    private Integer cost; // Стоимость продукта
    private String title; // Название продукта

    // Конструктор
    public Product(String title, Integer cost){
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}