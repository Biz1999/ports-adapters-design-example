package com.biz.hexagonal.config;

import com.biz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.biz.hexagonal.adapters.out.InsertCustomerAdapter;
import com.biz.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.biz.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
