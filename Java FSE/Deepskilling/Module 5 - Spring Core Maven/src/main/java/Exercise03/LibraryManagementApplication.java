package Exercise03;

import Exercise03.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        BookService service =
                (BookService) context.getBean("bookService");

        service.displayService();
    }
}