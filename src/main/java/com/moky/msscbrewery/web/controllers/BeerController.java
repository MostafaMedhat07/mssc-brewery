package com.moky.msscbrewery.web.controllers;

import com.moky.msscbrewery.services.BeerService;
import com.moky.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<Object> getBeer(@PathVariable("beerId") UUID beerId){
        System.out.println("Hello");
        return new ResponseEntity(beerService.getBeer(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createNewBeer(BeerDto beerDto){
        BeerDto createdBeer = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        //to do ip and port
        headers.add("location", "/api/v1/beer"+createdBeer.getBeerId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
}
