package Exercise07;

import Exercise07.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext7.xml");

        BookService service =
                (BookService) context.getBean("bookService");

        service.displayService();
    }
}