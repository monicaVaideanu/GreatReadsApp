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
    private String name;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;
}

