// src/test/java/com/example/demo/service/UserServiceTest.java
package com.example.forTests.service;

import com.example.forTests.entity.User;
import com.example.forTests.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetUserById() {
        User mockUser = new User("John Doe");
        mockUser.setId(1L);
        when(userRepository.findById(1L)).thenReturn(Optional.of(mockUser));

        Optional<User> result = userService.getUserById(1L);

        assertEquals("John Doe", result.get().getName());
        verify(userRepository).findById(1L);
    }
}
