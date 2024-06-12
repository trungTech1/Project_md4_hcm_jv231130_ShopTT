package rikkei.academy.modules.customer.service;

import rikkei.academy.modules.customer.Customer;
import rikkei.academy.modules.customer.dao.IUserDao;
import rikkei.academy.modules.customer.loginDto.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class UserServicelmpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public Customer getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

    @Override
    public void save(RegisterForm registerForm) {
        userDao.save(converFormRegisterToUser(registerForm));
    }

    @Override
    public Customer converFormRegisterToUser(RegisterForm form) {
        return new Customer(null, form.getUsername(), form.getEmail(), form.getPassword(), null, null, null, false, true, new Date(), null);
    }

}
