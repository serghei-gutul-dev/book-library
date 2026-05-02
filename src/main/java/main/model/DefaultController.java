package main.model;

import main.entity.Book;
import main.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DefaultController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/")
    public String index(Model model) {
        Iterable<Book> bookIterable = bookRepository.findAll();
        List<Book> books = new ArrayList<>();
        for (Book book : bookIterable) {
            books.add(book);
        }
        model.addAttribute("books", books);
        model.addAttribute("booksCount", books.size());
        return "index";
    }

    @PostMapping("/add")
    public String addBook(@RequestParam String title,
                          @RequestParam String author,
                          @RequestParam(required = false) Integer year) {

        bookRepository.save(new Book(title, author, year));
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/";
    }
}
