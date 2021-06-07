package com.moky.msscbrewery.services.impl;

import com.moky.msscbrewery.services.BeerService;
import com.moky.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeer(UUID beerId) {
        return BeerDto.builder().
                beerId(UUID.randomUUID()).
                beerName("Mostafa Beer").
                beerStyle("Mostafa Style").
                build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().beerId(UUID.randomUUID()).build();
    }
}
