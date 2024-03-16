package app.controllers;

import app.dtos.CreateUserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto userBody) {
        return ResponseEntity.ok("User created");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateName(){
        return ResponseEntity.ok("Name updated");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(){
        return ResponseEntity.ok("User deleted");
    }

}
