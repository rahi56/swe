package com.thinkconstructive.rest_demo.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorphoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String vedorId, String vendorName, String vendorAddress, String vendorphoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorphoneNumber = vendorphoneNumber;
    }
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorphoneNumber() {
        return vendorphoneNumber;
    }

    public void setVendorphoneNumber(String vendorphoneNumber) {
        this.vendorphoneNumber = vendorphoneNumber;
    }
}
