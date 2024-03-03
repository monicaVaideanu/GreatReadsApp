package app.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_details")
@Data
public class UserDetails {
    @Id
    @OneToOne
    @JoinColumn(name ="user_id")
    private User userId;
    private String firstName;
    private String lastName;
    @Nullable
    private String middleName;
}
