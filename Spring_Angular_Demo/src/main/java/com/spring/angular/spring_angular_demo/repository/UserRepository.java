package com.spring.angular.spring_angular_demo.repository;

import com.spring.angular.spring_angular_demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 6/2/2021
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
