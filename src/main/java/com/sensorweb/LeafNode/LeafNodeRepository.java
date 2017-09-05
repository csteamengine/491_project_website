package com.sensorweb.LeafNode;

import org.springframework.data.repository.CrudRepository;
import com.sensorweb.User.User;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface LeafNodeRepository extends CrudRepository<User, Long> {

}