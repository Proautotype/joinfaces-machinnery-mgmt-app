package org.joinfaces.example.services;

import org.joinfaces.example.models.User;
import org.joinfaces.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    final
    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> loginAsAdmin(String username,String password){
      Optional<User> user = userRepository.getAdminUsers(username,password);

      return user;
    }
}
