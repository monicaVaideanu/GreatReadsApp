package app.repositories;

import app.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {
    Optional<UserDetails> findByEmail(String email);
    Boolean existsByEmail(String email);
}
