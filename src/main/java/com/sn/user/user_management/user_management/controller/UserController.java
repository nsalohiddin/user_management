package com.sn.user.user_management.user_management.controller;

import com.sn.user.user_management.user_management.service.UserService;
import com.sn.user.user_management.user_management.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userService.getUSerByID(userId);
    }

    @PostMapping("/users")
    public User createUser(@Validated @RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId, @RequestBody User userDetails) {
        return userService.updateUser(userId, userDetails);
    }

    @DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) {
        return userService.deleteUser(userId);
    }
    @GetMapping("/users")
    public List<User> getAllUsers(
            @RequestParam(defaultValue = "desc") String order,
            @RequestParam(defaultValue = "1") int pageNo,
            @RequestParam(defaultValue = "30") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        return userService.getAllUsers(pageNo, size, sortBy, order);
    }

}
