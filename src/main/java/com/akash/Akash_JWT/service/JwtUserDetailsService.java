package com.akash.Akash_JWT.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
  //  private UserRepository userRepo;
   /* public JwtUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }*/
    /**
     *  User Principal finding logic.
     */
    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
       /* return this.userRepo.findByLoginId(loginId)
                .map(UserPrincipal::new)
                .orElseThrow(() -> new UsernameNotFoundException("LoginId: " + loginId + " not found"));*/
       if("akash@gmail.com".equals(loginId))
       {
           return new User("akash@gmail.com","$2y$10$WbaQJpv2xybGeaX2hta9Q.gzNyjcYfYJ5JOLSYPeFesgGNdJVeyUW",
                   new ArrayList<>());
       }
       else {
           throw new UsernameNotFoundException("Username not found with given name");
       }
    }
}