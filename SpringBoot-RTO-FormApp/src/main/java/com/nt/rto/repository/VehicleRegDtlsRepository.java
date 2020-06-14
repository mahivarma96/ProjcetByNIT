package com.nt.rto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.rto.entity.VehicleRegDtlsEntity;

@Repository
public interface VehicleRegDtlsRepository  extends JpaRepository<VehicleRegDtlsEntity,Serializable>{
	
	@Query("from  VehicleRegDtlsEntity e where e.owner.VehicleOwnerId=:oid")
	public VehicleRegDtlsEntity getElementById(@Param("oid")int oid);

}
