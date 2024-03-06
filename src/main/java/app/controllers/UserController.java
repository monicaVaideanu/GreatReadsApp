package app.controllers;

import app.dtos.CreateUserDto;
import app.dtos.UserDto;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto userBody) {
        return ResponseEntity.ok("User created");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserDto user) {
        return ResponseEntity.ok("User logged in");
    }

    @GetMapping("/update")
    public ResponseEntity<String> updateName(){
        return ResponseEntity.ok("Name updated");
    }

}
