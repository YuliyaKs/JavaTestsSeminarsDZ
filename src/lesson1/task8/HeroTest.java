/*
Используйте заготовку класса Hero и напишите следующие проверки для объекта Hero с использованием assert:
    1. Проверить, что герой создался с именем Emmett
    2. Проверить, что значение прочности брони героя равно 50
    3. Проверить, что у героя оружие типа sword
    4. Проверить содержимое инвентаря героя (не пустой, размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
    5. Проверить, что герой человек (свойство true)
*/

package lesson1.task8;

import java.util.Arrays;
import java.util.List;
public class HeroTest {
    public static void main(String[] args) {

        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        // Тесты
        // 1. Проверить, что герой создался с именем Emmett
        assert "Emmett".equals(emmett.getName()): "Name should be Emmett";

        // 2. Проверить, что значение прочности брони героя равно 50
        assert 50 == (emmett.getArmorStrength()): "Armor strength should be 50";

        // 3. Проверить, что у героя оружие типа sword
        assert "sword".equals(emmett.getWeapon()): "Weapon should be sword";

        // 4. Проверить содержимое инвентаря героя (не пустой, размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
        assert !(emmett.getBag().isEmpty()): "Bag don't should be empty";
        assert 3 == (emmett.getBag().size()): "Bag amount should be 3";
        assert "[Bow, Axe, Gold]".equals(emmett.getBag().toString()): "Bag should be Bow, Axe, Gold";
        assert (emmett.getBag().contains("Bow")): "Bag should be contains Bow";
        assert (emmett.getBag().contains("Axe")): "Bag should be contains Axe";
        assert (emmett.getBag().contains("Gold")): "Bag should be contains Gold";

        // 5. Проверить, что герой человек (свойство true)
        assert (emmett.isHuman()) : "Is human should be true";

    }

}
