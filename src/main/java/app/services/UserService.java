package app.services;

import app.repositories.UserDetailsRepo;
import app.repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final UserDetailsRepo userDetailsRepo;

    public void createUser() {
    }

    public void updateUserDetails() {
    }

    public void deleteUser() {
    }

    public void login() {
    }

    public void addReview() {
    }

    public void deleteReview() {
    }

    public void getReviewByUser() {
    }

}
