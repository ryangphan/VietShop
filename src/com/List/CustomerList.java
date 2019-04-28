package com.List;

import com.customer.Customer;
import com.customer.CustomerManager;

import java.util.ArrayList;
import java.util.List;

public class CustomerList implements CustomerManager {

    private List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        this.customers.add(customer);
    }

    @Override
    public void update(Customer customer) {
        delete(customer.getId());
        add(customer);
    }

    @Override
    public void delete(int id) {
        this.customers.remove(get(id));
    }

    @Override
    public List<Customer> getAll() {
        return this.customers;
    }

    @Override
    public Customer get(int id) {
        for(Customer c: customers){
            if(c.getId()==id) return c;
        }
        return null;
    }
}
