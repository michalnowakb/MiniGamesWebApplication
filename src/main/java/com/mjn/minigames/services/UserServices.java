package com.mjn.minigames.services;

import com.mjn.minigames.entities.UserEntity;
import com.mjn.minigames.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAll(){
        ArrayList<UserEntity> users = new ArrayList<>();
        userRepository.findAll().forEach(u -> users.add(u));
        return users;
    }

    public void addUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    public UserEntity getById(int id){
        return userRepository.findById(id).get();
    }

    public UserEntity editUser(UserEntity editedUser, int id){
        editedUser.setUserId(id);
        userRepository.save(editedUser);
        return editedUser;
    }

    public void removeUser(int id){
        userRepository.deleteById(id);
    }
}
