package rikkei.academy.modules.customer.dao;

import rikkei.academy.modules.customer.Customer;
import rikkei.academy.modules.customer.loginDto.RegisterForm;

public interface IUserDao {
    void register(RegisterForm registerForm);
    Customer login (String token);
    Customer getUserByUserName(String userName);
    void save(Customer customer);
}
