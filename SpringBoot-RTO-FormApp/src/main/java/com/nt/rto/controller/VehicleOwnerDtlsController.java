package com.nt.rto.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.rto.constants.AppConstants;
import com.nt.rto.entity.VehicleDetailsEntity;
import com.nt.rto.entity.VehicleOwnerDtlsEntity;
import com.nt.rto.pojo.VehicleDetails;
import com.nt.rto.pojo.VehicleOwnerDtls;
import com.nt.rto.repository.VehicleOwnerDtlsRepository;

@Controller
public class VehicleOwnerDtlsController {
	@Autowired
	private VehicleOwnerDtlsRepository vhcluserRepo;
	
 	@RequestMapping(value="/register")
	public String VhclRegForm(Model model) {
 		
 		VehicleOwnerDtls own= new VehicleOwnerDtls();
		model.addAttribute("reg", own);
		
		return "VehicleOwnerDtls" ;
		
	}
	
	
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String VhcleRegistration(@ModelAttribute("reg")VehicleOwnerDtls reg,Model model) {
		VehicleOwnerDtlsEntity entity=new VehicleOwnerDtlsEntity();
		BeanUtils.copyProperties(reg, entity);
		VehicleOwnerDtlsEntity savedEntity=vhcluserRepo.save(entity);
		model.addAttribute("reg", savedEntity);
		//System.out.println(vhcluser);
		return "redirect:/next";
		
	}
	
	
	
	
	
}
