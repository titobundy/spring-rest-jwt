package cl.personal.jpa.repository;

import java.util.List;

import cl.personal.jpa.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(@Param("name") String lastName);

	User findById(long id);
}
