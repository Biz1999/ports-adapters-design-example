package com.biz.hexagonal.application.ports.in;

import com.biz.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
