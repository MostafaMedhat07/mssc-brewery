package com.moky.msscbrewery.services;

import com.moky.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomer(UUID customerId);
}
