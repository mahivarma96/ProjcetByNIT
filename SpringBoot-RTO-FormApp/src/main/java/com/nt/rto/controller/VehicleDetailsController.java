package com.nt.rto.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.rto.entity.VehicleDetailsEntity;
import com.nt.rto.pojo.VehicleDetails;
import com.nt.rto.repository.VehicleDetailsRepository;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;

@Controller
public class VehicleDetailsController {
	
	@Autowired
	private VehicleDetailsRepository vhclDtlsRepo;
	
	@RequestMapping(value="/next")
	public String VhclDetailsReg(Model model) {
		VehicleDetails vdtls=new VehicleDetails();
		model.addAttribute("details", vdtls);
		return "Vehicledetails";
		
	}
	
	@RequestMapping(value="/next",method=RequestMethod.POST)
	public String VhcleDetails(@ModelAttribute("details")VehicleDetails details,Model model) {
		VehicleDetailsEntity entity1=new VehicleDetailsEntity();
		BeanUtils.copyProperties(details, entity1);
		VehicleDetailsEntity savedEntity=vhclDtlsRepo.save(entity1);
		model.addAttribute("details",savedEntity );
		System.out.println(details);
		return "redirect:/dtls" ;
		
	}
	

}
