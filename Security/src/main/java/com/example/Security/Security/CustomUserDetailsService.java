package com.example.Security.Security;

import com.example.Security.model.enitity.Users;
import com.example.Security.model.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = userRepository.findByUserName(username);
        if (username == null) {
            throw new UsernameNotFoundException("User not found");
        }


        return CustomUserDetails.mapUserToUserDetail(users);

    }
}


//return userRepository.findByUserName(username);