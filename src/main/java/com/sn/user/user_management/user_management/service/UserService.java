package com.sn.user.user_management.user_management.service;

import com.sn.user.user_management.user_management.exception.ResourceNotFoundException;
import com.sn.user.user_management.user_management.jpa.UserRepository;
import com.sn.user.user_management.user_management.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface UserService {
    public List<User> getAllUsers(Integer pageNo, Integer size, String sortBy, String direct);

    public List<User> getAllSortedUsers(String[] sort) ;

    public User getUSerByID(Long userId) ;

    public ResponseEntity<User> updateUser(Long userId, User userDetails) ;

    public Map<String, Boolean> deleteUser(Long userId);

    User createUser(User user);
}
