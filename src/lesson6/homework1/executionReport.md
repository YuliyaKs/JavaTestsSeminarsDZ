### Отчет о выполнении
#### - Код программы <br> src/lesson6/homework1/NumbersLists.java

#### - Код тестов <br> src/lesson6/homework1/Test/NumbersListsTest.java

#### - Отчет pylint/Checkstyle <br> До исправления недочетов 
![](checkstyleVronge.jpg)
#### После исправления основных недочетов
![](checkstyleCorrect.jpg)

#### - Отчет о покрытии тестами класса NumbersLists в размере 100%
![](testCoverage.jpg)

#### - Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии
Тестируемый класс **NumbersLists** содержит два метода: основной **compareAveragesValues** для сравнения чисел и вспомогательный **getAverageValue**, 
который вызывается из основного метода.
<br>Тестировать отдельно вспомогательный метод не нужно, т.к. он вызывается из основного метода.
<br>Тестами полностью покрыт основной метод **compareAveragesValues**, включая все ветвления в этом методе, а именно случаи, когда:
- Среднее значение в первом списке больше, чем во втором
- Среднее значение во втором списке больше, чем в первом
- Средние значения в обоих списках равны
- В качестве одного из параметров передан пустой список
- Пустые списки переданы в качестве обоих параметров
