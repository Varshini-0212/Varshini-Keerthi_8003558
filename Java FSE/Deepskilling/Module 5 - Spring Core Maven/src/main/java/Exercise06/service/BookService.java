package Exercise06.service;

import Exercise06.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void displayService() {
        System.out.println("Book Service is working");
        bookRepository.displayBook();
    }
}