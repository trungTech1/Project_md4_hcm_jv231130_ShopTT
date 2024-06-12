package com.example.modules.customer.service;


import com.example.modules.customer.Customer;
import com.example.modules.customer.loginDto.RegisterForm;

public interface IUserService {
    Customer getUserByUserName(String userName);
    void save(RegisterForm registerForm);
    Customer converFormRegisterToUser(RegisterForm form);
}
