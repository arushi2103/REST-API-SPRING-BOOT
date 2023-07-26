package com.learn.restdemo.Service;

import java.util.List;

import com.learn.restdemo.model.CloudVendor;

public interface CloudVendorService {
    public CloudVendor getCloudVendor(String CloudVendorId);

    public String createCloudVendor(CloudVendor CloudVendor);

    public String updateCloudVendor(CloudVendor CloudVendor);

    public String deleteCloudVendor(String CloudVendorId);

    public List<CloudVendor> getAllCloudVendors();

}
