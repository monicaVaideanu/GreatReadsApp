package app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController("/book")
public class BookController {
    public ResponseEntity<String> createBook() {
        return ResponseEntity.ok("Book created");
    }

    public ResponseEntity<String> updateBook() {
        return ResponseEntity.ok("Book updated");
    }

    public ResponseEntity<String> deleteBook() {
        return ResponseEntity.ok("Book deleted");
    }
    public ResponseEntity<String> getRatings() {
        return ResponseEntity.ok("Ratings retrieved");
    }
    public ResponseEntity<String> getBooksByGenre() {
        return ResponseEntity.ok("Books by genre retrieved");
    }
    public ResponseEntity<String> getBooksByLanguage() {
        return ResponseEntity.ok("Books by language retrieved");
    }
}
