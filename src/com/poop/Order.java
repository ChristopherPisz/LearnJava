package com.poop;

public class Order {

    public Order(Customer customer)
    {
        this.customer = customer;
    }

    public CustomerReadOnly getCustomer()
    {
        return (CustomerReadOnly) this.customer;
    }
    protected Customer customer;
}
