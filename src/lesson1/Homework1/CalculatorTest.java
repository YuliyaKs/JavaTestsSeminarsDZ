/*Задание 1. ** В классе Calculator создайте метод calculateDiscount, который
принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
Если метод calculateDiscount получает недопустимые аргументы, он должен
выбрасывать исключение ArithmeticException.
Не забудьте написать тесты для проверки этого поведения.
 */

package lesson1.Homework1;

import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка с корректными аргументами
        assertThat(Calculator.calculateDiscount(10, 90)).isEqualTo(1);
        assertThat(Calculator.calculateDiscount(10000, 55)).isEqualTo(4500);
        assertThat(Calculator.calculateDiscount(100000, 25)).isEqualTo(75000);
        assertThat(Calculator.calculateDiscount(1000000, 10)).isEqualTo(900000);
        assertThat(Calculator.calculateDiscount(10000000, 0)).isEqualTo(10000000);

        // Проверка с недопустимым первым аргументом
        assertThatThrownBy( () -> Calculator.calculateDiscount(9.99, 10))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(0, 10))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(-1000, 10))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy( () -> Calculator.calculateDiscount(10000000.01, 10))
                .isInstanceOf(NumberFormatException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(20000000, 10))
                .isInstanceOf(NumberFormatException.class);

        // Проверка с недопустимым вторым аргументом
        assertThatThrownBy( () -> Calculator.calculateDiscount(10000, -1))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(10000, 91))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(10000, -100))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(10000, 100))
                .isInstanceOf(ArithmeticException.class);
    }
}
