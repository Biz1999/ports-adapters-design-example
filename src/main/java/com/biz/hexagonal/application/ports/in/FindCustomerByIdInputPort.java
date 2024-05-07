package com.biz.hexagonal.application.ports.in;

import com.biz.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
