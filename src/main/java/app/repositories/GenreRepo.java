package app.repositories;

import app.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepo extends JpaRepository<Genre, Long> {
    boolean findByGenreName(String genreName);
    Long getGenreIdByGenreName(String name);
}
