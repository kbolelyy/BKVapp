package com.application.server.dao;

import com.application.server.hibernate.entity.UsersEntity;
import hibernate.utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KBolelyy on 13.08.2017.
 */


public class UserDao {

    public void addUser(UsersEntity user) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public void deleteUser(long userid) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            UsersEntity user = session.load(UsersEntity.class, userid);
            session.delete(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public void updateUser(UsersEntity user) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

 public List<UsersEntity> getAllUsers() {
       /* List<UsersEntity> users = new ArrayList<UsersEntity>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            users = session.createQuery("from UsersEntity").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }*/
        return null;
    }


    public UsersEntity getUserById(int userid) {
      /*  UsersEntity user = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from UsersEntity where id = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", userid);
            user = (UsersEntity) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return user;*/

      return null;
    }
}
