package app.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_details")
@Data
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_details_id")
    private Long userDetailsId;

    @OneToOne
    @JoinColumn(name ="user_id")
    private User user;

    private String firstName;
    private String lastName;
    @Nullable
    private String middleName;
}
