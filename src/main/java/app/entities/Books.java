package app.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Check;

import java.time.Year;
import java.util.Set;

@Entity
@Table(name = "books")
@Data
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    private String name;

    private String description;

    private Boolean availableToDownload;

    private Year yearPublication;

    private String publisher;
    @Check(constraints = "avrRating > 0.00 AND avrRating < 5.00")
    private Double avrRating;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<Genre> genres;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<Language> languages;

    @Nullable
    @OneToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;

    @ManyToMany(mappedBy = "publishedBooks", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Author> authors;
}
