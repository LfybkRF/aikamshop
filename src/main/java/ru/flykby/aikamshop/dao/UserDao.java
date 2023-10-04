package ru.flykby.aikamshop.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ru.flykby.aikamshop.entity.User;
import ru.flykby.aikamshop.utils.HibernateSessionFactoryUtil;

public class UserDao {


    public User findById(Integer id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }


    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.remove(user);
        tx.commit();
        session.close();
    }


}
