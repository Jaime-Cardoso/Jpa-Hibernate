package br.com.cursonelio.nelio.repository;

import br.com.cursonelio.nelio.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
