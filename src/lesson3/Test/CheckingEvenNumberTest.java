/* *Задание 1.
Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
является ли переданное число четным или нечетным. (код приложен в презентации)
*/

import lesson3.Homework1.CheckingEvenNumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckingEvenNumberTest {

    // Проверка четных чисел
    @ParameterizedTest
    @ValueSource(ints = {2, 10, 500, 0, -2, -8, -2147483648})
    public void getTrueEven(int number) {
        CheckingEvenNumber checkingEvenNumber = new CheckingEvenNumber();
        assertTrue(checkingEvenNumber.evenOddNumber(number));
    }

    // Проверка нечетных чисел
    @ParameterizedTest
    @ValueSource(ints = {1, 11, 2147483647, -1, -13, -12345})
    public void getFalseOdd(int number) {
        CheckingEvenNumber checkingEvenNumber = new CheckingEvenNumber();
        assertFalse(checkingEvenNumber.evenOddNumber(number));
    }

}
