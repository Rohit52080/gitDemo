package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Vendor;

@RepositoryRestResource(collectionResourceRel="vendor", path="newVendor")
public interface venodorControllerNew extends JpaRepository<Vendor, Long>{

}
