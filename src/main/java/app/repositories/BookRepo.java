package app.repositories;

import app.entities.Books;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;


@Repository
public interface BookRepo extends JpaRepository<Books, Long> {
    Optional<Books> findById(@NotNull Long id);
    Long findByName(String name);
    Set<Books> findAllByAuthorsContains(Long id);
    Set<Books> findAllByGenresContains(Long id);
    Set<Books> findAllByLanguagesContains(Long id);
//    Set<Books> findAllByCollectionId(Long id);
//    void updateAllByBookId(Long id);
//    void updateAuthors(Long id, Set<Author> authors);
//    void updateGenres(Long id, Set<Genre> genres);
//    void updateLanguages(Long id, Set<Language> languages);
//    void updateDescription(String description);
//    void updateYearPublication(Year yearPublication);
//    void updatePublisher(String publisher);
//    void updateAvrRating(Double avrRating);
//    void updateAvailableToDownload(boolean availableToDownload);



}
