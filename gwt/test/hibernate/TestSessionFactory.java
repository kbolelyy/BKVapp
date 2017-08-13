package hibernate;

import hibernate.utils.HibernateSessionFactory;
import org.hibernate.Session;


/**
 * Created by KBolelyy on 13.08.2017.
 */


public class TestSessionFactory {

    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

    }
}
