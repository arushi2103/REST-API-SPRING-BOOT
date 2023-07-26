package com.learn.restdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cloudvendor")
public class CloudVendor {
	@Id
	private String vendorId;
	private String vendorName;
	private String vendoreAddress;
	private String vendorPhoneNumber;

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

	public String getVendoreAddress() {
		return vendoreAddress;
	}

	public void setVendoreAddress(String vendoreAddress) {
		this.vendoreAddress = vendoreAddress;
	}

	public CloudVendor() {

	}

	public CloudVendor(String vendorId, String vendorName, String vendoreAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendoreAddress = vendoreAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

}
