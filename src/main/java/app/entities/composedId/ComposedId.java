package app.entities.composedId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ComposedId implements Serializable {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "book_id")
    private Long bookId;
}
