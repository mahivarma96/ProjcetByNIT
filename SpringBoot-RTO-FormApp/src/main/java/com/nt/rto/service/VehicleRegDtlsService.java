package com.nt.rto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.rto.entity.VehicleOwnerDtlsEntity;
import com.nt.rto.entity.VehicleRegDtlsEntity;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;
import com.nt.rto.repository.VehicleRegDtlsRepository;

@Service
public class VehicleRegDtlsService {
	
	@Autowired
	private VehicleOwnerDtlsRepository VhclOwnrDtlsRepository;
	
	@Autowired
	private VehicleRegDtlsRepository VhclRegDtlsRepository;
	
	public String VehicleRegRegister(int oid,VehicleRegDtlsEntity regstrn) {
		Optional<VehicleOwnerDtlsEntity> optional=VhclOwnrDtlsRepository.findById(oid);
		regstrn.setVOwnrDtls(optional.get());
		regstrn=VhclRegDtlsRepository.save(regstrn);
		return "your vehicle is registered with vehicle number:"+regstrn.getVehicleRegNum();
		
	}
	
	public VehicleRegDtlsEntity getVehicleRegById(int oid) {
		return VhclRegDtlsRepository.getElementById(oid);
		
	}

}
