package com.hdiaz.demo.repository;

import java.util.List;

import com.hdiaz.demo.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(@Param("name") String lastName);

	User findById(long id);
}
