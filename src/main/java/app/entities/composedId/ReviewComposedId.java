package app.entities.composedId;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class ReviewComposedId implements Serializable {
    private Long userId;
    private Long bookId;
}
