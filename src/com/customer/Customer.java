package com.customer;
import java.util.*;

public class Customer implements CustomerManager{

    private int id;
    private String name;
    private int phone;
    private Date birthday;
    private String address;
    private String email;

    @Override
    public void add(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer get(int id) {
        return null;
    }

    public Customer(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
