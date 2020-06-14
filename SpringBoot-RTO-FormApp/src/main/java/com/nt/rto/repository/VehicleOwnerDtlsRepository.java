package com.nt.rto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.nt.rto.entity.VehicleDetailsEntity;
//import com.nt.rto.entity.VehicleOwnerAddrsEntity;
import com.nt.rto.entity.VehicleOwnerDtlsEntity;

@Repository
public interface VehicleOwnerDtlsRepository extends JpaRepository<VehicleOwnerDtlsEntity,Serializable>{


}
