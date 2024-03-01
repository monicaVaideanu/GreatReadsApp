package app.entities;

import app.entities.composedId.UserReadBookId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "user read books")
@Data
public class UserReadBook {
    @EmbeddedId
    private UserReadBookId userReadBookId;
    private Date readDate;
    private Date finishDate;
}
