package com.mpocket.springbootchapter03.controllor;

import com.mpocket.springbootchapter03.bean.User;
import com.mpocket.springbootchapter03.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping({"/","/login"})
    //登录界面，用于界面查看
    public String login() {
        return "login";
    }

    @PostMapping("/user")
    // 注意，此处使用的是GetMapping注解，该注解的作用类似与@RequestMapping(value="/user/{id}" ,method=RequestMethod.GET)，@PostMapping注解同理
    public ModelAndView findById(@RequestParam("id") Long id) {
        ModelAndView modelAndView=new ModelAndView();
        User user = this.userRepository.findById(id).get();
        modelAndView.setViewName("hello");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
