package com.biz.hexagonal.application.ports.in;

import com.biz.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    public void update(Customer customer, String zipCode);
}
