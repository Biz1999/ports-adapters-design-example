package com.biz.hexagonal.application.ports.out;

import com.biz.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
