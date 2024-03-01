package app.entities;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.ISBN;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books_list")
@Data
public class BookList {
    @Id
    @ISBN
    private String bookId;
    private Year yearOfPublication;
    private String publisher;
    private Boolean availableToDownload;
    private Double averageRating;
    private String name;
    @OneToMany(mappedBy = "genreId", cascade = CascadeType.ALL)
    private Set<BookGenre> genres = new HashSet<>();

    @OneToMany(mappedBy = "languageId", cascade = CascadeType.ALL)
    private Set<BookLanguage> languages = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "books_to_authors",
    joinColumns = @JoinColumn(name = "authorId"),
    inverseJoinColumns = @JoinColumn(name = "bookId"))
    private Set<BookAuthor> authors = new HashSet<>();
}
