package app.entities;

import app.entities.composedId.UserReadBookId;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "user_read books")
@Data
public class UserReadBook {
    @EmbeddedId
    private UserReadBookId userReadBookId;

    @OneToOne
    @MapsId("userId")
    @JoinColumn(name = "id_user")
    private UserAccount idUser;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "id_book")
    private BookList book;
    private Date readDate;
    private Date finishDate;
}
