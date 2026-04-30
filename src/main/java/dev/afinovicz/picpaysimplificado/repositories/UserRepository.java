package dev.afinovicz.picpaysimplificado.repositories;

import dev.afinovicz.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByDocument(String documento);
    Optional<User> findUserById(Long id);
}
