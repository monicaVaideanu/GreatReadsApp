package app.dtos;

import app.entities.enums.Status;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotBlank
    private Long userId;
    @NotBlank
    @Email
    private String email;
    //TODO EXCLUDE MESSAGES
    @NotBlank(message = "Password is required")
    @Size(min = 5, message = "Password must be at least 5 characters long")
    @Size(max = 20, message = "Password should not contain more than 20 characters")
    @Pattern(regexp = "^(?!.*(?i)password).*$", message="The password should not contain the word password")
    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z]).*", message = "The password must contain at least one lowercase letter and one uppercase letter. Diacritics are not allowed")
    @Pattern(regexp = ".*\\d.*", message = "The password must contain at least one digit")
    @Pattern(regexp = ".*[@#$%^&+=;!].*", message = "The password must contain at least one special character(@#$%^&+=;)")
    @Pattern(regexp = "^\\S*$", message = "The password should not contain whitespaces")
    @ToString.Exclude
    private String password;
    @NotBlank
    private Status status;
}
