package app.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_details")
@Data
public class UserDetails {
    @Id
    @OneToOne
    @JoinColumn(name = "id_user")
    private UserAccount idUser;
    private String firstName;
    private String lastName;
    private String status;

}
