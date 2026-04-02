package com.example.vendorRest.controller;


import com.example.vendorRest.model.CloudVendor;
import com.example.vendorRest.repository.CloudVendorRepository;
import com.example.vendorRest.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                // this class is for expose for restapi
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    private final CloudVendorRepository cloudVendorRepository;

    // creating instance of CloudVendorService because controller talks to service layer

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    // when get request is arrived this method will get executed
    // read specific cloud vendor
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    // get all cloud vendor
    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created SuccessFully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "CloudVendor Updated SuccessFully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }





}
