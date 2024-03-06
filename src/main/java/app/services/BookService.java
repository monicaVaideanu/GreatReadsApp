package app.services;

import app.dtos.BooksDto;
import app.entities.Books;
import app.exceptions.BookAlreadyExistsException;
import app.repositories.BookRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Transactional
@Service
@AllArgsConstructor
public class BookService {
    @Autowired
    private final BookRepo bookRepo;
    private final ModelMapper mapper;
    public void createBook(BooksDto bookDto) {
        Optional<Books> book = bookRepo.findByNameAndAndAuthors(bookDto.getName(), bookDto.getAuthorIds());
        if(book.isEmpty()){
            bookRepo.save(mapper.map(bookDto, Books.class));
        } else{
            throw new BookAlreadyExistsException("Book already exists.");
        }
    }

    public void updateBook() {
    }

    public void deleteBook() {
    }

    public void getBooksByAuthor() {
    }

    public void getBooksByGenre() {
    }

    public void getBooksByLanguage() {
    }

    public void getBooksByCollection() {
    }

    public void getBooksByYear() {
    }

    public void getBooksByRating() {
    }

    public void getRatings() {
    }
}
