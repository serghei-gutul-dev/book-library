package main.service;

import main.entity.Book;
import main.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBook(Long id) {
        return repository.findById(id);
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
