package com.example.vendorRest.repository;

import com.example.vendorRest.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public class CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    // 1st is CloudVendor datatype and String is DATA Type for Id
//JpaRepository gives you lot of methods
    // you can write custom method here also



}
