/* Задание 3.  (необязательное)
Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
*/

import lesson3.Homework3.User;
import lesson3.Homework3.UserRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class UserRepositoryTest {

    // Инициализируем переменные для тестов
    UserRepository repository = new UserRepository();
    User user1 = new User("user1", "111", false);
    User admin1 = new User("admin1", "a111", true);
    User user2 = new User("user2", "222", false);
    User admin2 = new User("admin2", "a222", true);

    // Добавляем пользователей, прошедших аутентификацию и удаляем всех, кроме админов
    @BeforeEach
    public void setup() {
        user1.auth("user1", "111");
        admin1.auth("admin1", "a111");
        user2.auth("user2", "222");
        admin2.auth("admin2", "a222");
        repository.addUser(user1);
        repository.addUser(admin1);
        repository.addUser(user2);
        repository.addUser(admin2);
        repository.removeAllUsers();

    }

    // Проверяем, что в списке пользователей остались только админы
    @Test
    public void removeAllUsersTestAdmins() {
        assertThat(repository.data).contains(admin1, admin2);
    }

    // Проверяем, что в списке пользователей нет обычных пользователей
    @Test
    public void removeAllUsersTestUsers() {
        assertThat(repository.data).doesNotContain(user1, user2);
    }

    // Проверяем, что статус аутентификации у обычного пользователя равен False
    @Test
    public void removeAllUsersTestUserAuth() {
        assertFalse(user1.isAuth);
    }

    // Проверяем, что статус аутентификации у админов равен True
    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void removeAllUsersTestAdminsAuth(int number) {
        assertTrue(repository.data.get(number).isAuth);
    }
}

