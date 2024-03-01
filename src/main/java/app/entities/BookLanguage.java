package app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "books_languages")
@Data
public class BookLanguage {
    private String code;
    private String description;
    @Id
    private Integer languageId;
}
