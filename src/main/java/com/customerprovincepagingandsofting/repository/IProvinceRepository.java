package com.customerprovincepagingandsofting.repository;

import com.customerprovincepagingandsofting.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
}