/* Задание 2.
Разработайте и протестируйте метод numberInInterval, который проверяет,
попадает ли переданное число в интервал (25;100). (код приложен в презентации)
*/

import lesson3.Homework2.CheckingNumberInterval;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckingNumberIntervalTest {

    // Проверка числа внутри интервала (25;100)
    @ParameterizedTest
    @ValueSource(ints = {26, 33, 50, 85, 99})
    public void getTrueInterval(int number) {
        CheckingNumberInterval checkingNumberInterval = new CheckingNumberInterval();
        assertTrue(checkingNumberInterval.numberInInterval(number));
    }

    // Проверка числа за пределами интервала (25;100)
    @ParameterizedTest
    @ValueSource(ints = {25, 100, 0, -10, 125, 200})
    public void getFalseInterval(int number) {
        CheckingNumberInterval checkingNumberInterval = new CheckingNumberInterval();
        assertFalse(checkingNumberInterval.numberInInterval(number));
    }

}
