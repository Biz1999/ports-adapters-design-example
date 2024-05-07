package com.biz.hexagonal.config;

import com.biz.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.biz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.biz.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.biz.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.biz.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.biz.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
