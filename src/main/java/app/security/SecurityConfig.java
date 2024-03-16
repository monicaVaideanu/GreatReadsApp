package app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.configuration.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.configuration.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

////
//////AUTHORIZATION
//////https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html
@Configuration
//@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests( (a) -> a.anyRequest().permitAll()).httpBasic(Customizer.withDefaults());
//                .addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class)
//                .authorizeHttpRequests((auth) -> auth
//                        .requestMatchers(HttpMethod.POST, "/api/teacher/**").hasAnyAuthority("admin")
//                        .requestMatchers(HttpMethod.GET, "/api/teacher/**").hasAnyAuthority("admin", "user")
//                        .requestMatchers("/api/courses/**").hasAnyAuthority("admin", "user")
//                        .requestMatchers("/user/**").permitAll()
//                        .anyRequest().authenticated()
//                ).sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .httpBasic(Customizer.withDefaults())
//                .exceptionHandling(handler -> handler
//                        .authenticationEntryPoint(unauthorizedHandler)
//                        .accessDeniedHandler(accessDeniedHandler));

        return http.build();
    }
}
////
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http
////                .authorizeHttpRequests((authorize) -> authorize
////                        .requestMatchers("/login").permitAll()
////                        .anyRequest().authenticated()
////                )
////                .httpBasic(Customizer.withDefaults())
////                .formLogin(Customizer.withDefaults());
////
////        return http.build();
////    }
////
////    @Bean
////    public AuthenticationManager authenticationManager(UserDetailsService userDetailsService,
////            PasswordEncoder passwordEncoder) {
////        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
////        authenticationProvider.setUserDetailsService(userDetailsService);
////        authenticationProvider.setPasswordEncoder(passwordEncoder);
////
////        ProviderManager providerManager = new ProviderManager(authenticationProvider);
////        providerManager.setEraseCredentialsAfterAuthentication(false);
////        return providerManager;
////    }
////
////    @Bean
////    public UserDetailsService userDetailsService() {
////        UserDetails userDetails = User.withDefaultPasswordEncoder()
////                .username("user")
////                .password("password")
////                .roles("USER")
////                .build();
////
////        return new InMemoryUserDetailsManager(userDetails);
////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
////    }
//    @SneakyThrows
////    @Autowired
//    @Override
//    public void configure(HttpSecurity htttp) {
//        htttp.csrf(AbstractHttpConfigurer::disable);
//    }
////    @Bean
////    UserDetailsManager users(DataSource dataSource) {
////        UserDetails user = User.builder()
////                .username("user")
////                .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
////                .roles("USER")
////                .build();
////        UserDetails admin = User.builder()
////                .username("admin")
////                .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
////                .roles("USER", "ADMIN")
////                .build();
////        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
////        users.createUser(user);
////        users.createUser(admin);
////        return users;
////    }
//}
//
//
