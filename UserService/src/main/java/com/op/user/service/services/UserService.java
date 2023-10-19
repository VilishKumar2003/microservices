package com.op.user.service.services;

import com.op.user.service.entities.User;
import java.util.List;

public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId

    User getUser(String userId);

    //TODO: Delete
    //TODO: Update
}

