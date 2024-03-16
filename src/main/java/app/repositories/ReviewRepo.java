package app.repositories;

import app.entities.composedId.ReviewComposedId;
import app.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, ReviewComposedId> {
}
