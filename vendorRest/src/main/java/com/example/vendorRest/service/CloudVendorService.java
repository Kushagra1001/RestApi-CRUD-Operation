package com.example.vendorRest.service;

import com.example.vendorRest.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    // Write all the methods which are in service layer or

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);


    public List<CloudVendor> getAllCloudVendors();
}
