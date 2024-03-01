package app.entities;

import app.entities.composedId.BookReviewId;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "book_reviews")
@Data
public class BookReview {
    @EmbeddedId
    private BookReviewId bookReviewId;
    @OneToOne
    @MapsId("userId")
    @JoinColumn(name = "userId")
    private UserAccount userId;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "bookId")
    private BookList bookId;

    private String review;
    private Double rating;
    private Date publishDate;
}
