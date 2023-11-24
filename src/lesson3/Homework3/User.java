/* Задание 3.  (необязательное)
Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
*/

package lesson3.Homework3;

public class User {
    private String login;
    private String password;
    private boolean isAdmin; // добавили свойство, указывающее на администратора
    public boolean isAuth; // добавили статус Авторизации

    public User(String login, String password, boolean isAdmin){
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean auth(String login, String password) {
        isAuth = login == this.login && password == this.password; // добавили переменную для авторизации в метод
        return isAuth;
    }

    public void setIsAuth(boolean isAuth) { // метод устанавливает статус Авторизации
        this.isAuth = isAuth;
    }

    public boolean getIsAdmin() { // метод возвращает статус Администратора
        return isAdmin;
    }
}
