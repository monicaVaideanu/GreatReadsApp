package app.entities.composedId;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
public class PublishedBookId implements Serializable {
    private UUID userId;
    private String bookId;
}
