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

import static lesson1.Homework2.Shop.getMostExpensiveProduct;
import static lesson1.Homework2.Shop.sortProductsByPrice;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopTest {
    public static void main(String[] args) {

        // Создаем продукты
        Product apple = new Product("apple_kg", 80);
        Product banana = new Product("banana_kg", 100);
        Product orange = new Product("orange_kg", 150);
        Product lemon = new Product("lemon_kg", 160);
        Product kiwi = new Product("kiwi_kg", 200);

        // Создаем список продуктов для магазина
        List<Product> productList  = new ArrayList<>();
        productList.add(apple);
        productList.add(kiwi);
        productList.add(lemon);
        productList.add(banana);

        // Создаем магазин и список продуктов в нем
        Shop store = new Shop();
        store.setProducts(productList);

        // Находим самый дорогой продукт в магазине
        Product expensiveProduct = getMostExpensiveProduct(store.getProducts());
        System.out.printf("Самый дорогой продукт в магазине: %s по цене %s \n", expensiveProduct.getTitle(), expensiveProduct.getCost());

        // Сортировка продуктов в магазине
        store.setProducts(sortProductsByPrice(store.getProducts()));

        // Создаем корзину с продуктами: название и количество
        Map basket = new HashMap<>();
        basket.put(apple.getTitle(), 2);
        basket.put(kiwi.getTitle(), 1);
        basket.put(banana.getTitle(), 1);
        System.out.println("Содержимое корзины:" + basket);

        // Тесты
        // Проверка списка продуктов в магазине
        assertThat(store.getProducts()).contains(apple, kiwi, lemon, banana);
        assertThat(store.getProducts()).doesNotContain(orange);

        // Проверка правильного количества и верного содержимого продуктов в корзине
        assertThat(basket.toString()).contains("apple_kg=2", "banana_kg=1", "kiwi_kg=1");
        assertThat(basket.toString()).doesNotContain("orange_kg=3", "apple_kg=5");

        // Проверка правильности работы метода getMostExpensiveProduct
        assertThat(getMostExpensiveProduct(store.getProducts())).isEqualTo(kiwi);

        // Проверка правильности работы метода sortProductsByPrice
        assertThat(store.getProducts()).containsSequence(apple, banana, lemon, kiwi);

    }
}
