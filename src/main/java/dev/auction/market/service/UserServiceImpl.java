package dev.auction.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.auction.market.model.dto.UserDTO;
import dev.auction.market.model.entity.User;
import dev.auction.market.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public void insertUser(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setPw(userDTO.getPw());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        user.setAddress(userDTO.getAddress());

        userRepository.save(user);
    }
}
