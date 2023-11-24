package lesson3.Homework3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> data = new ArrayList<>();

    public void addUser(User user){
        if(user.isAuth) data.add(user);
    }

    // Метод по разлогиниванию всех пользователей, кроме администраторов
    public void removeAllUsers(){
        List<User> users = new ArrayList<>();
        for (User user: data){
            if (user.getIsAdmin()) {
                users.add(user);
            } else user.setIsAuth(false);
        }
        data = users;
    }

}

