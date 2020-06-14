package com.nt.rto.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.rto.entity.VehicleDetailsEntity;
import com.nt.rto.entity.VehicleOwnerDtlsEntity;

import com.nt.rto.repository.VehicleDetailsRepository;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;

@Service
public class VehicleDetailsService {
	@Autowired
	private VehicleOwnerDtlsRepository VhclOwnrDtlsRepository;
	
	
	@Autowired
	private VehicleDetailsRepository vhclDtlsRepository;

	public VehicleDetailsEntity vehicleRegister(int oid,VehicleDetailsEntity vehicle) {
		
		Optional<VehicleOwnerDtlsEntity> optional =VhclOwnrDtlsRepository.findById(oid);
		vehicle.setVOwnrDtls(optional.get());
		vehicle=vhclDtlsRepository.save(vehicle);
		return vehicle;
		
	
		
	}

	public VehicleDetailsEntity getVehicleDetailsByOid(int oid) {
		
		return vhclDtlsRepository.getEntityByOwnerId(oid);
	}

}



