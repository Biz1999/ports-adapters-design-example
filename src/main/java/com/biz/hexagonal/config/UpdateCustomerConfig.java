package com.biz.hexagonal.config;

import com.biz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.biz.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.biz.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.biz.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.biz.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
