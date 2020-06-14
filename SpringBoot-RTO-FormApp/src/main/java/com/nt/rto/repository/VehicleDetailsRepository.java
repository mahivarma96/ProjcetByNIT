package com.nt.rto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.rto.entity.VehicleDetailsEntity;


@Repository
public interface VehicleDetailsRepository extends JpaRepository<VehicleDetailsEntity,Serializable> {

	@Query("from VehicleDetailsEntity e where e.owner.VehicleOwnerId=:oid")
	 public VehicleDetailsEntity getEntityByOwnerId(@Param("oid")int oid);


	

}
