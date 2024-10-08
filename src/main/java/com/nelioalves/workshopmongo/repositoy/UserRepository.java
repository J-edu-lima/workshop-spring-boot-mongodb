package com.nelioalves.workshopmongo.repositoy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
