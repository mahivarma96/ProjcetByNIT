package com.nt.rto.entity;



import lombok.Data;

@Data
public class VehicleRegStrnCompositePrimaryKey  {
	private  Integer VehicleRegId;
	private String VehicleRegNum;
	
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((VehicleRegId==null)?0:VehicleRegId.hashCode());
		result=prime*result+((VehicleRegNum==null)?0:VehicleRegNum.hashCode());
;		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		VehicleRegStrnCompositePrimaryKey other=(VehicleRegStrnCompositePrimaryKey) obj;		
		if(VehicleRegId==null) {
			if(other.VehicleRegId!=null)
				return false;
		}
		else if(!VehicleRegId.equals(other.VehicleRegId))
		return false;
		if(VehicleRegNum==null) {
			if(other.VehicleRegNum!=null)
				return false;
		}
		else if(!VehicleRegNum.equals(other.VehicleRegNum))
			return false;
	    
		return true;
			
	}

}
