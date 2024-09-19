package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*select all*/
       /* NativeQuery query = session .createNativeQuery("select * from customer");
        query.addEntity(Customer.class);
        List<Customer> customerList = query.list();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }*/

        /*insert*/
       /* NativeQuery query = session.createNativeQuery("INSERT INTO customer (cid,name) VALUES (?1,?2)");
        query.setParameter(1, 3);
        query.setParameter(2, "Matheesha");
        query.executeUpdate();*/

        /*delete*/
       /* NativeQuery query = session.createNativeQuery("DELETE  FROM customer WHERE cid=?1");
        query.setParameter(1, 5);
        query.executeUpdate();*/

        /*update*/
       /* NativeQuery query = session.createNativeQuery("UPDATE customer SET name=?1 WHERE cid=?2");
        query.setParameter(1,"Dilmi");
        query.setParameter(2,1);
        query.executeUpdate();*/

        /*search by name*/
       /* NativeQuery query = session.createNativeQuery("SELECT * FROM customer WHERE name=?1",Customer.class);
        query.setParameter(1, "Kavishka");
        List<Customer> customers = query.getResultList();
        for (Customer customer : customers) {
            System.out.println(customer.getCid() + " " + customer.getName());
        }*/

        /*joinQuery*/
      /*  NativeQuery query = session.createNativeQuery("SELECT c.cid,c.name FROM Customer c INNER JOIN Address a ON c.cid = a.addressID");
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer addressID = (Integer) result[0];
            String no = (String) result[1];
            String road = (String) result[2];
            String city = (String) result[3];
            System.out.println(addressID + " " + no + " " + road + " " + city);
        }*/

        transaction.commit();
        session.close();
    }
}