package com.esliceu.demosecurityjwt.repos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public class UserRepo {

    @Autowired
    PasswordEncoder passwordEncoder;

    public Optional<UserDetails> findByUsername(String username){

        User u = null;
        if (username.equals("pedro")){
            u = new User("pedro", passwordEncoder.encode("pedro"),new ArrayList<>());


        }
        return Optional.ofNullable(u);
    }

}
