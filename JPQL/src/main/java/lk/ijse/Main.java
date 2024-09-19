package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("select c from Customer c");
        List<Customer> customerList = query.getResultList();
        for (Customer customer : customerList){
            System.out.println(customer.getCid() + customer.getName());
        }


        transaction.commit();
        session.close();

    }
}