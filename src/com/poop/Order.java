package com.poop;

public class Order {

    // TODO -
    // I want to take ownership of the customer when the order is created, because I do not want to user to change its
    // values from under me. Do I just trust them?
    public Order(Customer customer)
    {
        this.customer = customer;
    }

    // TODO -
    // I do not want the caller to change the value of the customer from under me, I want them to read only
    public Customer getCustomer()
    {
        return this.customer;
    }
    protected Customer customer;
}
