package app.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book_genres")
@Data
public class BookGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genreId;
    private String name;
    private String description;
}
