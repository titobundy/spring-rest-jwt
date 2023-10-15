package com.hdiaz.demo.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastname(@Param("name") String lastname);
    Optional<User> findByUsername(String username);

    User findById(long id);
}
