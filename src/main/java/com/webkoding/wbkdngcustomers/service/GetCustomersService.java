package com.webkoding.wbkdngcustomers.service;

import com.webkoding.wbkdngcustomers.model.Customer;

import java.util.List;


public interface GetCustomersService {

    List<Customer> getCustomers(String managerId);
}
