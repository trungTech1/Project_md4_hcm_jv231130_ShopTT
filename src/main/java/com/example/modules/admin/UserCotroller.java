package com.example.modules.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class UserCotroller {
    @GetMapping("")
    public String index(){
        return "admin/index";
    }
    //user
    @GetMapping("user")
    public String user(){
        return "admin/user/user";
    }
}
