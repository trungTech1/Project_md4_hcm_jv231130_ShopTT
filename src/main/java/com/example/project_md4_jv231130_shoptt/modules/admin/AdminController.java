package com.example.project_md4_jv231130_shoptt.modules.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/login")
    public String home(){
        return "login/index";
    }
    @GetMapping("")
    public String index(){
        return "admin/index";
    }
    @GetMapping("/user")
    public String user(){
        return "admin/user/user";
    }
    @GetMapping("/product")
    public String product(){
        return "admin/product/product";
    }
    @GetMapping("/category")
    public String category(){
        return "admin/category/category";
    }
    @GetMapping("/order")
    public String order(){
        return "admin/order/order";
    }
}