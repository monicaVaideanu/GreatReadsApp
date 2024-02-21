package app.entities;

import java.time.Year;
import java.util.UUID;

public class BookList {

    private String name;
    private UUID bookListId;
    private Year yearOFPublication;
    private String publisher;
    private Boolean availableToDownload;
    private Double averageRating;
    private Integer genreId;
    private Integer languageId;
    private UUID authorId;
}
