package com.stackroute.multimodelservice.service;

import com.stackroute.multimodelservice.domain.User;

public interface UserService {
    public User saveUser(User user);

    public User getUserById(int id);

}
