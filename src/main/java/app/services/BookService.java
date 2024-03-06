package app.services;

import app.dtos.AuthorDto;
import app.dtos.BooksDto;
import app.entities.Books;
import app.exceptions.AlreadyExistsException;
import app.exceptions.DoesnotExistException;
import app.exceptions.UpdateFailed;
import app.repositories.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Transactional
@Service
@AllArgsConstructor
public class BookService {
    @Autowired
    private final BookRepo bookRepo;
    @Autowired
    private final ModelMapper mapper;
    @Autowired
    private final AuthorRepo authorRepo;
    @Autowired
    private final GenreRepo genreRepo;
    @Autowired
    private final LanguageRepo languageRepo;
    @Autowired
    private final CollectionRepo collectionRepo;

    public void createBook(BooksDto bookDto) {
        //check if book already exists
        Long id = bookRepo.findByName(bookDto.getName());
        Optional<Books> book = bookRepo.findById(id);
        if (book.isEmpty()) {
            bookRepo.save(mapper.map(bookDto, Books.class));
        } else {
            throw new AlreadyExistsException("Book already exists.");
        }
    }

//    public boolean updateBook(String bookName, String newDescription, String newYear, String) {
//        Long id = bookRepo.findByName(bookDto.getName());
//        Optional<Books> book = bookRepo.findById(id);
//        if (book.isPresent()) {
//            boolean updated = bookRepo.updateBooks(mapper.map(bookDto, Books.class));
//            if (!updated) {
//                throw new UpdateFailed("Update failed.");
//            }
//        } else {
//            throw new DoesnotExistException("Book doesn't exist.");
//        }
//    }

    public void deleteBook(BooksDto booksDto) {
        Long id = bookRepo.findByName(booksDto.getName());
        Optional<Books> book = bookRepo.findById(id);
        if (book.isPresent()) {
            bookRepo.deleteById(id);
        } else {
            throw new DoesnotExistException("Book doesn't exist.");
        }
    }

    public Set<Books> getBookByAuthor(AuthorDto authorDto) {
        Long id = authorDto.getAuthorId();
        if (id.equals(0L)) {
            throw new DoesnotExistException("Author doesn't exist.");
        }
        return bookRepo.findAllByAuthorsContains(id);
    }

    public Set<Books> getBooksByGenre(String genre) {

        if (genreRepo.findByGenreName(genre)) {
            throw new DoesnotExistException("Genre doesn't exist.");
        }
        return bookRepo.findAllByGenresContains(genreRepo.getGenreIdByGenreName(genre));
    }

    public Set<Books> getBooksByLanguage(String language) {

        if (languageRepo.findByLanguageName(language)) {
            throw new DoesnotExistException("Language doesn't exist.");
        }
        return bookRepo.findAllByLanguagesContains(languageRepo.getLanguageIdByLanguageName(language));

    }

    public void getBooksByCollection(String collectionName) {
    }

    public void getBooksByYear() {
    }

    public void getBooksByRating() {
    }

    public void getRatings() {
    }
}
