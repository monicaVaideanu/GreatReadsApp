package app.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "books_languages")
@Data
public class BookLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageId;
    private String code;
    private String description;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private BookList book;
}
