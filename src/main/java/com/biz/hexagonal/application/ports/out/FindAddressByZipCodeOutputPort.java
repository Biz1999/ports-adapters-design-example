package com.biz.hexagonal.application.ports.out;

import com.biz.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
