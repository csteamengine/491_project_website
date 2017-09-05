package com.sensorweb.Reading;

import org.springframework.data.repository.CrudRepository;
import com.sensorweb.User.User;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SensorReadingRepository extends CrudRepository<User, Long> {

}
