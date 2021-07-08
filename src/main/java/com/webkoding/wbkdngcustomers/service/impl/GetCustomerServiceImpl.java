package com.webkoding.wbkdngcustomers.service.impl;

import com.webkoding.wbkdngcustomers.model.Customer;
import com.webkoding.wbkdngcustomers.repository.CustomerRepository;
import com.webkoding.wbkdngcustomers.service.GetCustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetCustomerServiceImpl implements GetCustomersService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers(String managerId) {
        if (managerId != null)
            return customerRepository.findByIsActiveFalse();
        return customerRepository.findAll();
    }
}
