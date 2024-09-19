package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*select all*/
       /* Query query = session.createQuery("select c from Customer c");
        List<Customer> customerList = query.getResultList();
        for (Customer customer : customerList){
            System.out.println(customer.getCid() + customer.getName());
        }*/

        /*update*/
      /*  Query query1 = session.createQuery("update Customer  c set c.name = :name where c.cid = :Id");
        query1.setParameter("name","Matheesha");
        query1.setParameter("Id",3);
        query1.executeUpdate();*/

        /*delete*/
       /* Query query2 = session.createQuery("delete from Customer c where c.cid = :Id");
        query2.setParameter("Id",3);
        query2.executeUpdate();*/

        /*search by id*/
       /* Query query3 = session.createQuery("select c from Customer c where c.cid = :Id");
        query3.setParameter("Id",1);
        List<Customer> stList = query3.getResultList();
        for (Customer student : stList){
            System.out.println(student.getCid());
        }*/

       /* join query*/
        Query query4 = session.createQuery("select a from Customer c join c.addresses a where c.cid = :Id");
        query4.setParameter("Id",1);
        List<Address> list = query4.getResultList();
        for (Address address : list){
            System.out.println("Address no :"+address.getNo());
        }

        transaction.commit();
        session.close();

    }
}