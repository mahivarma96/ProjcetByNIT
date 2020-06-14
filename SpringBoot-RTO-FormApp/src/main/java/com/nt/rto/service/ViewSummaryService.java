package com.nt.rto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.rto.entity.VehicleRegDtlsEntity;
import com.nt.rto.entity.ViewSummaryEntity;
import com.nt.rto.repository.VehicleDetailsRepository;
import com.nt.rto.repository.VehicleOwnerAddrsDtlsRepository;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;

@Service
public class ViewSummaryService {
	
	@Autowired
	private VehicleOwnerDtlsRepository VhclOwnrDtlsRepository;
	
	@Autowired
	private VehicleDetailsRepository vhclDtlsRepository;

	@Autowired
	private VehicleOwnerAddrsDtlsRepository vhclOwnerAddrsRepository;
	
	public ViewSummaryEntity viewsummary(int oid,VehicleRegDtlsEntity vehicleReg) {
		ViewSummaryEntity viewsummary= new ViewSummaryEntity();
		viewsummary.setVOwnrDtls(VhclOwnrDtlsRepository.findById(oid).get());
		viewsummary.setVehicle(vhclDtlsRepository.getEntityByOwnerId(oid));
		viewsummary.setAddress(vhclOwnerAddrsRepository.getEntityByOwnerId(oid));
		viewsummary.setVehicleReg(vehicleReg);
		return viewsummary;
		
	}
	
	

}
