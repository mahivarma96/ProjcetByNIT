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
@Table(name="Vehicle_Dtls")
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleDetailsEntity {
	@Id
	@SequenceGenerator(name="gen2",sequenceName="VHCL_DTLS_ID_SEQ",initialValue=200,allocationSize=1)
	@GeneratedValue(generator="gen2",strategy=GenerationType.SEQUENCE)
	@Column(name="Vhcl_DTLS_ID")
	@Type(type="int")
	private Integer Vhcl_DTLS_ID;
	
	
	@Column(name="V_Type")
	@Type(type="String")
	private String type;
	
	@Column(name="Mfg_year")
	@Type(type="int")
	private int Mfgyear;
	
	@Column(name="Vmodel")
	@Type(type="string")
	private String vmodel;
	
	@Column(name="CompanyName")
	@Type(type="string")
	private String CompanyName;
	
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
	private VehicleOwnerDtlsEntity  VOwnrDtls;


}
