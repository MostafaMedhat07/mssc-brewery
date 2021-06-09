package com.moky.msscbrewery.services;

import com.moky.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    public BeerDto getBeer(UUID beerId);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public void updateBeer(UUID beerId, BeerDto beerDto);
}
