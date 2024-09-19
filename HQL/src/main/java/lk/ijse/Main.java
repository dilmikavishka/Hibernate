package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*select all*/
        /*Query query = session.createQuery("from Customer");
            List<Customer> customerList = query.list();
                for (Customer customer : customerList){
                     System.out.println(customer.getCid());
                    }*/

        /*insert*/
     /*   NativeQuery query = session.createNativeQuery("INSERT INTO Customer (cid,name) VALUES (:1,:2)");
        query.setParameter("1", 4);
        query.setParameter("2", "Paramith");
        query.executeUpdate();*/

        /*delete*/
        /*Query query = session.createQuery("DELETE FROM Customer where cid =:cid");
        query.setParameter("cid",4);
        query.executeUpdate();*/

        /*update*/
        /*Query query = session.createQuery("UPDATE Customer SET name = :name WHERE cid = :cid");
        query.setParameter("name","Mallika");
        query.setParameter("cid",3);
        query.executeUpdate();*/

        /*get one column*/
      /*  Query query=session.createQuery("SELECT c.cid, c.name FROM Customer c WHERE c.cid = :cid");
        query.setParameter("cid", 1);
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer cid = (Integer) result[0];
            String name = (String) result[1];
            System.out.println("Customer id: " + cid + ", Name: " + name);
        }*/

        /*get all column*/
      /*  Query query = session.createQuery("select c.cid ,c.name from Customer c");
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer cid = (Integer) result[0];
            String name = (String) result[1];
            System.out.println("Student no: " + cid + ", Name: " + name);
        }*/

        /*join query*/
     /*   Query query = session.createQuery("SELECT a.addressID, a.no,a.road,a.city FROM Address a INNER JOIN a.customer c WHERE c.cid = :addressID");
        query.setParameter("addressID", 1);
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer addressID = (Integer) result[0];
            String no = (String) result[1];
            String road = (String) result[2];
            String city = (String) result[3];
            System.out.println(addressID + " " + no + " " + road + " " + city );
        }*/

        transaction.commit();
        session.close();
    }
}