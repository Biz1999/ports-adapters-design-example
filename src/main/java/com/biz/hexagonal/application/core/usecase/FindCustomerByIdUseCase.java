package com.biz.hexagonal.application.core.usecase;

import com.biz.hexagonal.application.core.domain.Customer;
import com.biz.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.biz.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class FindCustomerByIdUseCase  implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
