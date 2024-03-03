package app.services;

import app.dtos.UserDetailsDto;
import app.dtos.UserDto;
import app.entities.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Transactional
@Service
@AllArgsConstructor
public class UserService {
    public UserDto saveUser(UserDto userDto, UserDetailsDto userDetailsDto) {
        userDetailsDto(userDetailsDto);
        return null;
    }
    UserDetailsDto userDetailsDto(UserDetailsDto userDetailsDto){
        return null;
    }
}
