package cl.personal.jpa.repository;

import java.util.List;

import cl.personal.jpa.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(String lastName);

	User findById(long id);
}
