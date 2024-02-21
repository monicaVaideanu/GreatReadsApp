package app.entities;

import java.util.Date;
import java.util.UUID;

public class BookReview {
    private UUID userId;
    private UUID bookId;
    private String review;
    private int rating;
    private Date publishDate;
}
