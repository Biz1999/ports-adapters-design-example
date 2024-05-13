package com.biz.hexagonal.application.ports.in;

import com.biz.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
