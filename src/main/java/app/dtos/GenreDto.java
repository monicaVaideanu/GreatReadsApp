package app.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenreDto {
    @NotBlank
    private Long genreId;
    @NotBlank(message = "Name cannot be blank.")
    private String name;
    @NotBlank(message = "Description cannot be blank.")
    private String description;
}
