package com.nt.rto.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="Vechile_Owner_Dtls")
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleOwnerDtlsEntity  {
	@Id
	@SequenceGenerator(name="gen1",sequenceName="VHCL_OWNER_DTLS_ID_SEQ",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	@Column(name="VehicleOwner_id")
	@Type(type="int")
	private Integer VehicleOwner_id;
	
	@Column(name="Frst_name")
	@Type(type="String")
	private String FirstName;
	
	@Column(name="Last_Name")
	@Type(type="String")
	private String LastName;
	
	@Column(name="Email")
	@Type(type="String")
	private String Email;
	
	@Column(name="Phno")
	@Type(type="long")
	private String Phno;
	
	@Column(name="DOB")
	@Type(type="date")
	private int DOB;
	
	@Column(name="SSNO")
	@Type(type="long")
	private String SSNO;
	
	@Column(name="CREATE_DT")
	@Type(type="date")
	@CreationTimestamp
	private Date CreateDate;
	
	@Column(name="UPDATE_DT")
	@Type(type="date")
	@UpdateTimestamp
	private Date UpdateDate;
	
	public VehicleOwnerDtlsEntity() {
		System.out.println("VehicleOwnerDtlsEntity.VehicleOwnerDtlsEntity()");
	}

}
