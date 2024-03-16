package app.entities;

import app.entities.composedId.ReviewComposedId;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;


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
    private UserDetails userId;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Books bookId;

    private Double rating;
    @Nullable
    private String reviewText;

    private Date publishDate;

}
