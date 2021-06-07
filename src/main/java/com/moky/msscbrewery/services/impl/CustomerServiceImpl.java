package com.moky.msscbrewery.services.impl;

import com.moky.msscbrewery.services.CustomerService;
import com.moky.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().customerId(UUID.randomUUID()).customerName("Mostafa Medhat").build();
    }
}
