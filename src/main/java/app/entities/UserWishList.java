package app.entities;

import app.entities.composedId.WishListId;
import jakarta.persistence.*;
import lombok.Data;

import java.awt.print.Book;

@Entity
@Table(name = "user_whishlist")
@Data
public class UserWishList {
    @EmbeddedId
    private WishListId wishListId;
    @OneToOne
    @MapsId("userId")
    @JoinColumn(name = "id_user")
    private UserAccount idUser;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "id_book")
    private BookList book;
    private String status;
}
