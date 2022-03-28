package dev.auction.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.auction.market.model.dto.UserDTO;
import dev.auction.market.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public void insertUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);

        userService.insertUser(userDTO);
        System.out.println();
    }
}
