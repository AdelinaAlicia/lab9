package lab8.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
    private PersistenceUtil(){

    }
    public static EntityManagerFactory create(String s) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory(
                        s);
        return factory;
    }
}
