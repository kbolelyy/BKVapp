import org.hibernate.Session;

/**
 * Created by KBolelyy on 21.04.2017.
 */
public class RunSessionHibernate {
    //Запуск сессия для теста
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

    }

}
