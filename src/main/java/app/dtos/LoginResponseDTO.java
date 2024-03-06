package app.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    String email;
    String value;
    Long id;
    String role;
}
