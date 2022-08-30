package com.poc.modules.address.rest;

import com.poc.modules.address.model.Address;
import com.poc.modules.address.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressRest implements AddressApi{

    @Autowired
    private AddressServices addressServices;

    @GetMapping
    @Override
    public ResponseEntity<List<Address>> ListAddress() {
        List<Address> list = addressServices.searchAll();
        return ResponseEntity.ok().body(list);
    }

}
