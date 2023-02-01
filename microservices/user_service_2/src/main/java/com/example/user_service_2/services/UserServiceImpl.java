package com.example.user_service_2.services;

import com.example.user_service_2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    //fake user list

    List<User> list = List.of(
            new User(1311L, "Yashi", "1234567890"),
            new User(1312L, "Yashi2", "1234567899"),
            new User(1313L, "Yashi3", "1234567898")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}