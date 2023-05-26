package br.com.cursonelio.nelio.repository;

import br.com.cursonelio.nelio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
