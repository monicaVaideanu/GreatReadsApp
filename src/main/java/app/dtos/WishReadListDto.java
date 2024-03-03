package app.dtos;

import app.entities.enums.Wish;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishReadListDto {
    @NotBlank
    private Long wishListId;
    @NotBlank
    private Long userId;
    @NotBlank
    private Long bookId;
    @NotBlank
    private Date addDate = new Date();
    @NotBlank
    private Wish wish;
    @NotBlank
    private Date endDate;
    @NotBlank
    private Date startDate;
}
