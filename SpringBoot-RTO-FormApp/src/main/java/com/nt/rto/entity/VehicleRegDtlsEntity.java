package com.nt.rto.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="Vehicle_Reg_Dtls")
@Data
@IdClass(VehicleRegStrnCompositePrimaryKey.class)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleRegDtlsEntity {
	@Id
	@SequenceGenerator(name="gen4",sequenceName="VHCL_REG_DTLS_ID_SEQ",initialValue=400,allocationSize=1)
	@GeneratedValue(generator="gen4",strategy=GenerationType.SEQUENCE)
	@Column(name="Vehicle_Reg_Id")
	@Type(type="int")
	private Integer VehicleRegId;
	
	@Column(name="Reg_Date")
	@Type(type="date")
	private Date RegDate;
	
	@Column(name="Reg_Center")
	@Type(type="string")
	private String RegCenter;
	
	@Column(name="CREATE_DT")
	@Type(type="date")
	@CreationTimestamp
	private Date CreateDate;
	
	@Column(name="UPDATE_DT")
	@Type(type="date")
	@UpdateTimestamp
	private Date UpdateDate;
	
	@OneToOne(targetEntity=VehicleOwnerDtlsEntity.class,orphanRemoval=true)
	@JoinColumn(name="VehicleOwner_id",referencedColumnName="VehicleOwner_id")
	private VehicleOwnerDtlsEntity VOwnrDtls;

	@Id
	@GenericGenerator(name="seq_vehicle_num",strategy="com.nt.rto.generator.VehicleRegistrationNumGenerator")
	@GeneratedValue(generator="seq_vehicle_num")
	@Column(name="Vehicle_Reg_Num")
	@Type(type="string")
	private String VehicleRegNum;
	 
	public VehicleRegDtlsEntity() {
		System.out.println("VehicleRegDtlsEntity.VehicleRegDtlsEntity()");
	}
	
}
