package com.example.modules.customer.dao;


import com.example.modules.customer.Customer;
import com.example.modules.customer.loginDto.RegisterForm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaolmpl implements IUserDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void register(RegisterForm registerForm) {

    }

    @Override
    public Customer login(String token) {
        return new Customer();
    }

    @Override
    public Customer getUserByUserName(String userName) {
        Session session = sessionFactory.getCurrentSession();
        String sql = "from Customer where customerName = :userName";
        return (Customer) session.createQuery(sql).setParameter("userName", userName).getSingleResult();
    }

    @Override
    public void save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }


}
