package com.nt.rto.generator;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.function.IntSupplier;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class VehicleRegisrationNumGenerator implements IdentifierGenerator {
     
	private static final String SEQ_VEHICLE_NUM="SELECT SEQ_VEHICLE_NUM.NEXTVAL FROM DUAL";
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		char[] characters=null;
		StringBuffer stringBuffer=null;
		Random random=new Random();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int val=0;
		try {
			IntSupplier intSupplier=()-> random.nextInt(25);
			characters = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
					'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
			stringBuffer = new StringBuffer();
			for(int i=0;i<2;i++)
				stringBuffer.append(characters[intSupplier.getAsInt()]);
			stringBuffer.append("");
			con=session.connection();
			ps=con.prepareStatement(SEQ_VEHICLE_NUM);
			rs=ps.executeQuery();
			if(rs.next()) {
				val=rs.getInt(1);
				if(val<9)
					stringBuffer.append(0).append(val);
					else
						stringBuffer.append(val);
				stringBuffer.append("");
				for(int i=0;i<4;i++)
					stringBuffer.append(characters[intSupplier.getAsInt()]);
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			   return "-1";
		   }
	       finally {
	    	   if(rs!=null) {
	    		  try {
	    		   rs.close();
	    		  }
	    		  catch (Exception e) {
					e.printStackTrace();
				  }
	    	   }
	    		if(ps!=null) {
	    			try {
	    				ps.close();
	    			}
	    			catch (Exception e) {
						e.printStackTrace();
					}
	    		}	  
	  }//finally
	   return stringBuffer.toString();     
	}

}
