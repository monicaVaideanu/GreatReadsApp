package app.entities;

import app.entities.composedId.ReviewComposedId;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Check;

import java.util.Date;

@Data
@Table(name = "reviews")
@Entity
public class Review {
    @EmbeddedId
    private ReviewComposedId reviewId;
    @OneToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User userId;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Books bookId;
    @Check(constraints = "rating > 0.00 AND rating < 5.00")
    private Double rating;

    private String reviewText;

    private Date publishDate;

}
