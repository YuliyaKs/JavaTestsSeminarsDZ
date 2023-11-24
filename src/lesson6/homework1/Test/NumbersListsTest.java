import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static lesson6.homework1.NumbersLists.*;

public class NumbersListsTest {

    @Test
    public void compareAveragesValuesTest() {
        // Создаем списки чисел
        List<Integer> listMedium = new ArrayList<>();
        IntStream.range(11, 20).forEach(listMedium::add);
        System.out.println(listMedium);

        List<Integer> listSmall = new ArrayList<>();
        IntStream.range(1, 10).forEach(listSmall::add);
        System.out.println(listSmall);

        List<Integer> listBig = new ArrayList<>();
        IntStream.range(21, 30).forEach(listBig::add);
        System.out.println(listBig);

        List<Integer> listEmpty = new ArrayList<>();


        // Проверка, что среднее значение первого списка больше среднего значения второго списка
        assert (compareAveragesValues(listMedium, listSmall).equals("Первый список имеет большее среднее значение"));

        // Проверка, что среднее значение второго списка больше среднего значения первого списка
        assert (compareAveragesValues(listMedium, listBig).equals("Второй список имеет большее среднее значение"));

        // Проверка, что средние значения обоих списков равны
        assert (compareAveragesValues(listMedium, listMedium).equals("Средние значения равны"));

        // Проверка, что один из списков или оба списка пустые
        assert (compareAveragesValues(listMedium, listEmpty).equals("Списки не должны быть пустыми"));
        assert (compareAveragesValues(listEmpty, listEmpty).equals("Списки не должны быть пустыми"));

    }

}
