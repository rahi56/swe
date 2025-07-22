package com.thinkconstructive.rest_demo.Controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    @GetMapping("{vendorId}")
    public CloudVendor getCloudvendorDetails(String vendorId)
    {
        return new CloudVendor("C1","Vendor1","Address 1","xxxx");
    }
}
