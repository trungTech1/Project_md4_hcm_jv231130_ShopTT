package rikkei.academy.modules.customer.service;


import rikkei.academy.modules.customer.Customer;
import rikkei.academy.modules.customer.loginDto.RegisterForm;

public interface IUserService {
    Customer getUserByUserName(String userName);
    void save(RegisterForm registerForm);
    Customer converFormRegisterToUser(RegisterForm form);
}
