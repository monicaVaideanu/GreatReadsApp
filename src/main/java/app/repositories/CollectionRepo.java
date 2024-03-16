package app.repositories;

import app.entities.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollectionRepo extends JpaRepository<Collection, Long> {
    boolean findByName(String name);
    Optional<Collection> findById(Long id);

    Boolean existsByName(String name);
    Object save(Collection collection);
}
