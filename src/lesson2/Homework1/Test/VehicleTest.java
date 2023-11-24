import lesson2.Homework1.*;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class VehicleTest {

    // 1- Проверить, что экземпляр объекта Car также является экземпляром
    // транспортного средства (используя оператор instanceof).
    @Test
    public void testParentClass() {
        Car car = new Car("AVTOVAZ", "Lada Granta", 2020);

        assertThat(car instanceof Vehicle);
    }

    // 2- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarNumWheels() {
        Car car = new Car("AVTOVAZ", "Lada Granta", 2020);

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // 3- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycleNumWheels() {
        Motorcycle motorcycle = new Motorcycle("Irbis Motors", "Irbis TTR", 2022);

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // 4- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarSpeed() {
        Car car = new Car("AVTOVAZ", "Lada Granta", 2020);
        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // 5- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Irbis Motors", "Irbis TTR", 2022);
        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // 6- Проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarParking() {
        Car car = new Car("AVTOVAZ", "Lada Granta", 2020);
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // 7- Проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleParking() {
        Motorcycle motorcycle = new Motorcycle("Irbis Motors", "Irbis TTR", 2022);
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
