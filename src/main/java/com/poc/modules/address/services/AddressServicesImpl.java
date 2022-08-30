package com.poc.modules.address.services;

import com.poc.modules.address.model.Address;
import com.poc.modules.address.repository.AddressRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableJpaRepositories
public class AddressServicesImpl implements AddressServices {

    @Override
    public List<Address> searchAll() {
        return AddressRepository.findAll();
    }
}
