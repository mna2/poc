package com.poc.modules.address.rest;

import com.poc.modules.address.model.Address;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AddressApi {

    ResponseEntity<List<Address>> ListAddress();
}
