package hibernate;

import hibernate.utils.HibernateSessionFactory;
import hibernate.utils.HibernateUtil;
import org.junit.Test;


/**
 * Created by KBolelyy on 13.08.2017.
 */


public class TestSessionFactory {

    @Test
   public void testOpenSessionHibernate(){
        HibernateSessionFactory.getSessionFactory().openSession();

    }
}
