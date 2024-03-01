package app.entities;

import app.entities.composedId.PublishedBookId;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "user_published_books")
@Data
public class UserPublishedBook {
   @EmbeddedId
    private PublishedBookId publishedBookId;
    @OneToOne
    @MapsId("userId")
    @JoinColumn(name = "id_user")
    private UserAccount idUser;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "id_book")
    private BookList book;
    private Date publishDate;
}
