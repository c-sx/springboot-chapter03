package com.mpocket.springbootchapter03.controllor;

import com.mpocket.springbootchapter03.bean.User;
import com.mpocket.springbootchapter03.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    // 注意，此处使用的是GetMapping注解，该注解的作用类似与@RequestMapping(value="/user/{id}" ,method=RequestMethod.GET)，@PostMapping注解同理
    public User findById(@PathVariable Long id) {
        return this.userRepository.findById(id).get();
    }
}
