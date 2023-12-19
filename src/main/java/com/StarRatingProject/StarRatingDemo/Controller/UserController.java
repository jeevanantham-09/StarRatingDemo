package com.StarRatingProject.StarRatingDemo.Controller;

import com.StarRatingProject.StarRatingDemo.Dto.Userdto;
import com.StarRatingProject.StarRatingDemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/dashboard")
    public  String getUserLogin(@ModelAttribute Userdto userdto){
        return "dashboard";
    }
}
