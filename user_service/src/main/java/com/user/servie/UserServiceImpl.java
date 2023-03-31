package com.user.servie;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // List<User> list=new ArrayList<User>((Collection<? extends User>) new User(1311L,"Raoof","8990909"));

    List<User> list=new ArrayList<User>();



    @Override
    public User getUser(Long userId) {

        list.add(new User(1311L,"Raoof","8990909"));
        return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
