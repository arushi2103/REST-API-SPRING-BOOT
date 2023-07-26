package com.learn.restdemo.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.restdemo.Repository.CloudVendorRepository;
import com.learn.restdemo.Service.CloudVendorService;
import com.learn.restdemo.model.CloudVendor;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor CloudVendor) {

        cloudVendorRepository.save(CloudVendor);
        return "success";
    }

    @Override
    public String updateCloudVendor(CloudVendor CloudVendor) {

        throw new UnsupportedOperationException("Unimplemented method 'updateCloudVendor'");
    }

    @Override
    public String deleteCloudVendor(String CloudVendorId) {
        cloudVendorRepository.deleteById(CloudVendorId);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(String CloudVendorId) {
        return cloudVendorRepository.findById(CloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

}
