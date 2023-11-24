package lesson4.Homework2;

import java.util.List;

public interface BookRepo {
    Book findById(String id);
    List<Book> findAll();
}
