package app.repositories;

import app.entities.WishReadList;
import app.entities.composedId.ComposedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishReadListRepo extends JpaRepository<WishReadList, ComposedId> {
}
