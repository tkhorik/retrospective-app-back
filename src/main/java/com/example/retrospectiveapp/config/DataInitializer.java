package com.example.retrospectiveapp.config;

import com.example.retrospectiveapp.entity.Role;
import com.example.retrospectiveapp.entity.User;
import com.example.retrospectiveapp.repository.RoleRepository;
import com.example.retrospectiveapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class DataInitializer {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostConstruct
    @Transactional
    public void init() {
        // Create roles
        Role userRole = new Role();
        userRole.setName("ROLE_USER");
        roleRepository.save(userRole);

        Role adminRole = new Role();
        adminRole.setName("ROLE_ADMIN");
        roleRepository.save(adminRole);

        // Create users
        User user = new User();
        user.setUsername("user");
        user.setPassword(bCryptPasswordEncoder.encode("password"));
        user.setEmail("user@example.com");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRoles(userRoles);
        userRepository.save(user);

        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword(bCryptPasswordEncoder.encode("admin"));
        admin.setEmail("admin@example.com");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        admin.setRoles(adminRoles);
        userRepository.save(admin);
    }
}