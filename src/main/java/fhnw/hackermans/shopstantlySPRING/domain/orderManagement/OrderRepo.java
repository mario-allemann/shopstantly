package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface OrderRepo extends CrudRepository<Order, Integer> {
	@Query("SELECT orderId, state, date FROM order")
	Iterable<Order> findAll();
}