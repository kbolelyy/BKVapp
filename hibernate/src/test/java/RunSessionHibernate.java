import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;


public class RunSessionHibernate extends Assert {
    //Запуск сессия для теста
    @Test
    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

    }

}
