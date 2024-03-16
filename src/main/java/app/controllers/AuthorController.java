package app.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    public ResponseEntity<String> addAuthor() {
        return ResponseEntity.ok("Author added");
    }
    public ResponseEntity<String> updateAuthor() {
        return ResponseEntity.ok("Author updated");
    }
    public ResponseEntity<String> deleteAuthor() {
        return ResponseEntity.ok("Author deleted");
    }
    public ResponseEntity<String> getBooksByAuthor() {
        return ResponseEntity.ok("Books retrieved");
    }
}
