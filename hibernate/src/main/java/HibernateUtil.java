import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by KBolelyy on 21.04.2017.
 */

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {

        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());

        sessionFactory = cfg.buildSessionFactory(registryBuilder.build());

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
