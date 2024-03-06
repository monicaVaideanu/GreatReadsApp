package app.repositories;

import app.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;


@Repository
public interface BookRepo extends JpaRepository<Books, Long> {
    Optional<Books> findById(Long id);
    Long findByName(String name);
    Set<Books> findAllByAuthorsContains(Long id);
    Set<Books> findAllByGenresContains(Long id);
    Set<Books> findAllByLanguagesContains(Long id);
//    Set<Books> findAllByCollectionId(Long id);
//    boolean updateBooks(Books book);



}
