package com.biz.hexagonal.adapters.in.consumer.mapper;

import com.biz.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.biz.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
