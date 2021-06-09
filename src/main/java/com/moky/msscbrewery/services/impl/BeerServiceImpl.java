package com.moky.msscbrewery.services.impl;

import com.moky.msscbrewery.services.BeerService;
import com.moky.msscbrewery.web.model.BeerDto;
import com.moky.msscbrewery.web.model.BeerStypeEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeer(UUID beerId) {
        return BeerDto.builder().
                beerId(UUID.randomUUID()).
                beerName("Mostafa Beer").
                beerStyle(BeerStypeEnum.SAISON).
                build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().beerId(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl
    }
}
