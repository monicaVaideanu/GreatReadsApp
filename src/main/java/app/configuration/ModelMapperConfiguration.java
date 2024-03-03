package app.configuration;

import app.dtos.UserDto;
import app.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {
    //https://www.baeldung.com/java-modelmapper
    //https://modelmapper.org/getting-started/
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        return new ModelMapper();
    }
}
