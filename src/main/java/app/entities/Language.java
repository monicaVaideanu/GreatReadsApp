package app.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Long languageId;

    private String code;
    @Column(name = "language_name")
    private String languageName;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;
}

