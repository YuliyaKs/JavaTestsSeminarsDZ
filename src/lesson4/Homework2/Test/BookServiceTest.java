/*Задание 2.
У вас есть класс BookService, который использует интерфейс BookRepository для
получения информации о книгах из базы данных. Ваша задача написать unit-тесты
для BookService, используя Mockito для создания мок-объекта BookRepository.
 */

import lesson4.Homework2.Book;
import lesson4.Homework2.BookRepository;
import lesson4.Homework2.BookService;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    // Создаем mock-объект BookRepository
    @Mock
    private BookRepository mockBookRepository;

    private BookService bookService;

    @BeforeEach
    public void setup() {

        MockitoAnnotations.initMocks(this); // Инициализируем mock

        // Создаем экземпляр BookService с использованием mock-объекта
        bookService = new BookService(mockBookRepository);
    }


    // Тестируем метод findBookById в классе BookService
    @Test
    public void findBookByIdTest() {

        // Создаем объект книги
        Book book = new Book("3", "Book3", "Author3");

        // Устанавливаем ожидание - когда метод mockBookRepository.findById("3")
        // вызывается, должен возвращаться объект book
        when(mockBookRepository.findById("3")).thenReturn(book);

        // Вызываем метод findBookById() на экземпляре bookService
        Book result = bookService.findBookById("3");

        // Проверяем, что результат соответствует ожиданиям
        assertEquals(book, result);

        // Проверяем, что метод mockBookRepository.findById("3") был вызван ровно один раз
        verify(mockBookRepository, times(1)).findById("3");
    }


    // Тестируем метод findAllBooks в классе BookService
    @Test
    public void findAllBooksTest() {

        // Создаем список книг, аналогичный содержащемуся в BookRepository
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "Book1", "Author1"));
        books.add(new Book("2", "Book2", "Author2"));

        // Устанавливаем ожидание - когда метод mockBookRepository.findAll()
        // вызывается, должен возвращаться объект books
        when(mockBookRepository.findAll()).thenReturn(books);

        // Вызываем метод findAllBooks() на экземпляре bookService
        List<Book> result = bookService.findAllBooks();

        // Проверяем, что результат соответствует ожиданиям
        assertEquals(books, result);

        // Проверяем, что метод mockBookRepository.findAll() был вызван ровно один раз
        verify(mockBookRepository, times(1)).findAll();
    }
}