package Exercise06;

import Exercise06.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext6.xml");

        BookService service =
                context.getBean(BookService.class);

        service.displayService();
    }
}