package Exercise05;

import Exercise05.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext5.xml");

        BookService service =
                (BookService) context.getBean("bookService");

        service.displayService();
    }
}