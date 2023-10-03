package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")

    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
//                new CloudVendor("c1","Vendor",
//                "Address one","xxxxx");
    }
    @PostMapping
    public String CreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
            this.cloudVendor = cloudVendor;
            return "cloud vendor created successfully";
    }
    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloud vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "cloud vendor deleted successfully";
    }
}
