package br.com.cursonelio.nelio.repository;

import br.com.cursonelio.nelio.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
