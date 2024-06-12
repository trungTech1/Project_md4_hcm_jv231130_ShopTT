package com.example.modules.customer.dao;

import com.example.modules.customer.Customer;
import com.example.modules.customer.loginDto.RegisterForm;

public interface IUserDao {
    void register(RegisterForm registerForm);
    Customer login (String token);
    Customer getUserByUserName(String userName);
    void save(Customer customer);
}
