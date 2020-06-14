package com.nt.rto.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleOwnerAddrsDetails {
	private Integer Address_Id;
	private String HouseNo;
	private String StreetName;
	private String City;
	private String Zipcode;
	private Date CreateDate;
	 private Date UpdateDate;
}
