package com.customer;

import java.util.List;

public interface CustomerManager {

    void add(Customer customer);
    void update(Customer customer);
    void delete(int id);
    List<Customer> getAll();
    Customer get(int id);
}
