/*
 * @author : Supun Jaysinghe
 * Date    : 03 March 2023
 * Time    : 8:07 PM
 * Project : Thgakade With Hibernate
 * Created by IntelliJ IDEA.
 */
package lk.ccns.thogakade.util;

import lk.ccns.thogakade.entity.Customer;
import lk.ccns.thogakade.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class);
        sessionFactory=configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }

}
