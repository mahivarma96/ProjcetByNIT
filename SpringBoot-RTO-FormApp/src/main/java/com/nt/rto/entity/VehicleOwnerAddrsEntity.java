package com.nt.rto.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="Vehicle_Owner_Addrs_Dtls")
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleOwnerAddrsEntity  {
	@Id
	@SequenceGenerator(name="gen3",sequenceName="VHCL_OWNR_ADDRS_ID_SEQ",initialValue=300,allocationSize=1)
	@GeneratedValue(generator="gen3",strategy=GenerationType.SEQUENCE)
	@Column(name="Address_Id")
	@Type(type="Long")
	private Integer Address_Id;
	
	@Column(name="House_no")
	@Type(type="string")
	private String HouseNO;
	
	@Column(name="StreetName")
	@Type(type="string")
	private String StreetName;
	
	@Column(name="City")
	@Type(type="string")
	private String City;
	
	@Column(name="Zip_code")
	@Type(type="string")
	private String Zipcode;
	
	@Column(name="CREATE_DT")
	@Type(type="date")
	@CreationTimestamp
	private Date CreateDate;
	
	@Column(name="UPDATE_DT")
	@Type(type="date")
	@UpdateTimestamp
	private Date UpdateDate;

	@JsonIgnore
	@XmlTransient
	@OneToOne(targetEntity=VehicleOwnerDtlsEntity.class,orphanRemoval=true)
	@JoinColumn(name="VehicleOwner_id",referencedColumnName="VehicleOwner_id")
	private VehicleOwnerDtlsEntity VOwnrDtls;

}
