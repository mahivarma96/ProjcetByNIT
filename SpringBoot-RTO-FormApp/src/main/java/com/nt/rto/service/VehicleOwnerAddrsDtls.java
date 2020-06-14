package com.nt.rto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.rto.entity.VehicleOwnerAddrsEntity;
import com.nt.rto.entity.VehicleOwnerDtlsEntity;
import com.nt.rto.repository.VehicleOwnerAddrsDtlsRepository;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;

@Service
public class VehicleOwnerAddrsDtls {
	
	@Autowired
	private VehicleOwnerDtlsRepository vhclOwnrDtlsRepository; 
	
	@Autowired
	private VehicleOwnerAddrsDtlsRepository vhclOwnerAddrsRepository;
	
	public VehicleOwnerAddrsEntity addressRegister(int oid,VehicleOwnerAddrsEntity addrs) {
		Optional<VehicleOwnerDtlsEntity> optional=vhclOwnrDtlsRepository.findById(oid);
		addrs.setVOwnrDtls(optional.get());
		addrs=vhclOwnerAddrsRepository.save(addrs);
		return addrs;
		
	}
	public VehicleOwnerAddrsEntity getAddrsDetailsById(int oid) {
		return vhclOwnerAddrsRepository.getEntityByOwnerId(oid);
		
	}

}
