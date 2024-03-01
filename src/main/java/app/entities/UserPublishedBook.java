package app.entities;

import app.entities.composedId.PublishedBookId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "user_published_books")
@Data
public class UserPublishedBook {
   @EmbeddedId
    private PublishedBookId publishedBookId;
    private Date publishDate;
}
