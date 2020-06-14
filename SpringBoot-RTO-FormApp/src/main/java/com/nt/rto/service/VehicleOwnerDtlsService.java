package com.nt.rto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.rto.entity.VehicleOwnerDtlsEntity;
import com.nt.rto.exception.VehicleNotFoundException;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;

@Service
public class VehicleOwnerDtlsService {
	
	@Autowired
	private VehicleOwnerDtlsRepository VhclOwnrDtlsRepository;
	
	public VehicleOwnerDtlsEntity  ownerRegister(VehicleOwnerDtlsEntity owner) {
		owner=VhclOwnrDtlsRepository.save(owner);
		return owner;
	}

	public VehicleOwnerDtlsEntity getOwnerDetailsById(int oid) throws Exception {
		Optional<VehicleOwnerDtlsEntity> optional=null;
		if(VhclOwnrDtlsRepository.existsById(oid)) {
		optional = VhclOwnrDtlsRepository.findById(oid);
		}
		else {
			throw new VehicleNotFoundException("Vehicle Not Found");
		}
		return optional.get();
	}

}



