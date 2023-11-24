package lesson6.homework1;

import java.util.List;

public class NumbersLists {

    // Метод находит среднее значение в списке целых чисел
    public static float getAverageValue(final List<Integer> list) {
        int sum = 0;
        float result;
        for (int number: list) {
            sum += number; }
        result = (float) sum / list.size();
        return result;
    }

    // Метод сравнивает средние значения
    public static String compareAveragesValues(final List<Integer> list1, final List<Integer> list2) {
        String result;
        float averageValue1 = getAverageValue(list1);
        float averageValue2 = getAverageValue(list2);
        if (list1.isEmpty() || list2.isEmpty()) {
            result = "Списки не должны быть пустыми";
        } else if (averageValue1 > averageValue2) {
            result = "Первый список имеет большее среднее значение";
        } else if (averageValue2 > averageValue1) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }
        return result;
    }
}
