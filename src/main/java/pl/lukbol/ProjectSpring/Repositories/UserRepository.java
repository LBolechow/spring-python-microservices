package pl.lukbol.ProjectSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lukbol.ProjectSpring.Models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findByPhoneNumber(String phoneNumber);

    Optional<User> findOptionalByEmail(String email);

    User findByUsername(String username);

    Optional<User> findOptionalByUsername(String usernameOrEmail);

}
