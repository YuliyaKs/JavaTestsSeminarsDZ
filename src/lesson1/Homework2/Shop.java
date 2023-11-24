package lesson1.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public static List<Product> sortProductsByPrice(List<Product> products) {
        List<Product> newproducts = new ArrayList<>();
        for (int i = 0; i < products.size();) {
            Integer min = products.get(0).getCost();
            Product element = products.get(0);
            for (Product product : products) {
                if (product.getCost() < min) {
                    min = product.getCost();
                    element = product;
                }
            }
            newproducts.add(element);
            products.remove(element);
        }
        return newproducts;
    }

    // Метод должен вернуть самый дорогой продукт
    public static Product getMostExpensiveProduct(List<Product> products) {
        Product expensive = products.get(0);
        Integer max = products.get(0).getCost();
        for (Product product : products){
            if (product.getCost() > max) {
                max = product.getCost();
                expensive = product;
            }
        }
        return expensive;
    }
}