/*Задание 1. ** В классе Calculator создайте метод calculateDiscount, который
принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
Если метод calculateDiscount получает недопустимые аргументы, он должен
выбрасывать исключение ArithmeticException.
Не забудьте написать тесты для проверки этого поведения.
 */

package lesson1.Homework1;
public class Calculator {
    public static void main(String[] args) {
        System.out.printf("Сумма покупки со скидкой: %s \n", calculateDiscount(1234.5678,11));
//        System.out.printf("Сумма покупки со скидкой: %s \n", calculateDiscount(-1234.56,78));
//        System.out.printf("Сумма покупки со скидкой: %s \n", calculateDiscount(10000001,78));
//        System.out.printf("Сумма покупки со скидкой: %s \n", calculateDiscount(1234.56,-1));
    }
    public static double calculateDiscount(double purchaseAmount, int discountAmount){
        double dicountedAmount = 0;
        if (purchaseAmount < 10 ) {
            throw new IllegalArgumentException("Сумма покупки не может быть меньше 10 рублей");
        }else if (purchaseAmount > 10000000 ){
            throw new NumberFormatException("Сумма покупки не может быть больше стоимости всех товаров в магазине");
        }else if (discountAmount < 0 || discountAmount > 90){
            throw new ArithmeticException("Процент скидки должен быть в пределах от 0 до 90");
        }else {dicountedAmount = (double) Math.round((purchaseAmount - purchaseAmount * discountAmount / 100) * 100) / 100;}
        return dicountedAmount;
    }
}
