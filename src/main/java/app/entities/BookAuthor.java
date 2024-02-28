package app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.Year;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "book_authors")
@Data
public class BookAuthor {
    @Id
    private UUID authorId;

    private String firstName;
    private String lastName;

    private String description;
    //private List<UUID> publishedBooks;
    private String country;
}
