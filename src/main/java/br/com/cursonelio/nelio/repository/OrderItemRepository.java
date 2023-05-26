package br.com.cursonelio.nelio.repository;

import br.com.cursonelio.nelio.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
