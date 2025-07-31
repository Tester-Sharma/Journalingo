package com.tester.journalApp.repository;

import com.tester.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    public User findByusername(String username);
    public void deleteByusername(String UserName);
}


