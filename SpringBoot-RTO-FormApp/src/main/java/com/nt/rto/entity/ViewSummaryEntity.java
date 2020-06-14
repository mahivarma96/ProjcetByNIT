package com.nt.rto.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ViewSummaryEntity {
	
	@XmlElement
	private VehicleOwnerDtlsEntity VOwnrDtls;
	
	@XmlElement
	private VehicleDetailsEntity Vehicle;
	
	@XmlElement
	private VehicleOwnerAddrsEntity Address;
	
	@XmlElement
	private VehicleRegDtlsEntity VehicleReg;

}
