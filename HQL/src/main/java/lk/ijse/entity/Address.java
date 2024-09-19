package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private int addressID;
    private String no;
    private String road;
    private String city;
    @ManyToOne
    @JoinColumn(name="Customer_Id")//database eke table eke name eka wenas karanna puluwan owning side ekata thama denne
    private Customer customer; //owners end
    public Address() {}

    public Address(int addressID, String no, String road, String city, Customer customer) {
        this.addressID = addressID;
        this.no = no;
        this.road = road;
        this.city = city;
        this.customer = customer;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



}
