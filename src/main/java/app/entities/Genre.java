package app.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Long genreId;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;
}
