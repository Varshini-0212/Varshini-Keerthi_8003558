package Exercise02;

import Exercise02.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        BookService service =
                (BookService) context.getBean("bookService");

        service.displayService();
    }
}