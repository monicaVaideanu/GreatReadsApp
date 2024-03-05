package app.repositories;

import app.entities.Review;
import app.entities.composedId.ReviewComposedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, ReviewComposedId> {
}
