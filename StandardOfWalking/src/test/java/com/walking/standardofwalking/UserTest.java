package com.walking.standardofwalking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void save(){
        //유저 정보 생성
        User user1 = User.builder()
//                .cid(0L)
                .name("김연우")
                .userid("user1")
                .password("password1")
                .email("user1@email.com")
                .gender("female")
                .age("28")
                .build();

        User user2 = User.builder()
//                .cid(1L)
                .name("배주현")
                .userid("user2")
                .password("password2")
                .email("user2@email.com")
                .gender("female")
                .age("25")
                .build();

        User user3 = User.builder()
//                .cid(2L)
                .name("강슬기")
                .userid("user3")
                .password("password3")
                .email("user3@email.com")
                .gender("female")
                .age("27")
                .build();

        //유저정보 저장
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }

    @Test
    void findAll(){
        List<User> userList = userRepository.findAll();
    }


    @Test
    void delete(){
        User entity = userRepository.findById(12L).get();
        userRepository.delete(entity);
    }
}
