package app.entities;

import app.entities.composedId.BookReviewId;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Entity
@Table(name = "book_reviews")
@Data
public class BookReview {
    @EmbeddedId
    private BookReviewId bookReviewId;
    private String review;
    private Double rating;
    private Date publishDate;
}
