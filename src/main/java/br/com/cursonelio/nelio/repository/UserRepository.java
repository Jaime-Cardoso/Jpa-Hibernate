package br.com.cursonelio.nelio.repository;

import br.com.cursonelio.nelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
