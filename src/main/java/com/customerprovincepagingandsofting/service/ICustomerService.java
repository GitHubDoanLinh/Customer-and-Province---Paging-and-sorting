package com.customerprovincepagingandsofting.service;

import com.customerprovincepagingandsofting.model.Customer;
import com.customerprovincepagingandsofting.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICustomerService extends IGenerateService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
