package com.patika.paycore.Project.security;


import com.patika.paycore.Project.model.entity.User;
import com.patika.paycore.Project.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetails implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
       User user=userRepository.findByUsername(username);

       if(user==null){
           throw new UsernameNotFoundException("User"+username+" not found");
       }

       return org.springframework.security.core.userdetails.User
               .withUsername(username)
               .password(user.getPassword())
               .authorities(user.getRoles())
               .accountExpired(false)
               .accountLocked(false)
               .credentialsExpired(false)
               .disabled(false)
               .build();
    }


}
