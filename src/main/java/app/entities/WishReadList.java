package app.entities;

import app.entities.composedId.ComposedId;
import app.entities.enums.Wish;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;

@Entity
@Data
@Table(name = "wish_read_list")
public class WishReadList {
    @EmbeddedId
    private ComposedId wishListId;

    @OneToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User userId;
    @OneToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Books bookId;

    private Date addDate;
    @ColumnDefault("'WISH'")
    @Enumerated(EnumType.STRING)
    private Wish wish;

    @Nullable
    private Date endDate;
    @Nullable
    private Date startDate;
}
