package com.mjn.minigames.repositories;

import com.mjn.minigames.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
}
