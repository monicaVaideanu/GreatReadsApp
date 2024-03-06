package app.repositories;

import app.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;


@Repository
public interface BookRepo extends JpaRepository<Books, Long> {
    Optional<Books> findByNameAndAndAuthors(String name, Set<Long> authors);
    Optional<Books> findByName(String name);
    Optional<Books> findById(Long id);

    void deleteById(Long id);
}
