package com.learn.restdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    

}
