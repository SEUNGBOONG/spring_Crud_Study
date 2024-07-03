package com.example.demo.service;

import com.example.demo.model.userData.User;
import com.example.demo.model.userData.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User saveUser(Long userId, Long userPassword) {
        Optional<User> user = userRepository.findByUserId(userId);
        save(user);
        return user.get();
    }

    private static void save(final Optional<User> user) {
        if (!user.isPresent()) {
            throw new EntityNotFoundException("회원가입이 되어있지 않습니다.");
        }
    }

    public User joinExistUser(Long userId) {
        except(userId);
        return joinExistUser(userId);
    }

    private static void except(final Long userId) {
        if (userId.equals(userId)) {
            try {
                throw new Exception("이미 회원가입이 되어있습니다.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


