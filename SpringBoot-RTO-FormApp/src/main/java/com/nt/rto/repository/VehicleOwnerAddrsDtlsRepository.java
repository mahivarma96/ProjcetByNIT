package com.nt.rto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.rto.entity.VehicleOwnerAddrsEntity;

@Repository
public interface VehicleOwnerAddrsDtlsRepository extends JpaRepository<VehicleOwnerAddrsEntity,Serializable> {
 
	
	@Query("from VehicleOwnerAddrsEntity e where e..owner.VehicleOwner_id=:oid")
	public VehicleOwnerAddrsEntity getEntityByOwnerId(@Param("oid") int oid);
	
	
}
