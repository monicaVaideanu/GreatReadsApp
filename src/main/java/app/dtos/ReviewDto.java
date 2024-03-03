package app.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    @NotBlank
    private Long userId;
    @NotBlank
    private Long bookId;
    @NotBlank
    @Positive
    @Max(value = 5)
    private Double rating;
    @NotBlank
    private Date publishDate;
    private String reviewText;

}
