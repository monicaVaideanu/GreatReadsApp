package app.entities;

import app.entities.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @UniqueElements
    private String email;
    @ToString.Exclude
    private String password;
    @ColumnDefault("'READER'")
    @Enumerated(EnumType.STRING)
    private Status status;
}
