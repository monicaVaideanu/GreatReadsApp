package app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Transactional
@Service
@AllArgsConstructor
public class AuthorService {
    public void publishBook(){
    }

}
