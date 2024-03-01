package app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
    private String country;
}
