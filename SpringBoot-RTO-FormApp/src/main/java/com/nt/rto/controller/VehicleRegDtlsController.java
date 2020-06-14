package com.nt.rto.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.rto.entity.VehicleRegDtlsEntity;
import com.nt.rto.pojo.VehicleRegDtls;
import com.nt.rto.repository.VehicleRegDtlsRepository;

@Controller
public class VehicleRegDtlsController {
	@Autowired
	private  VehicleRegDtlsRepository vhclRegDtlsRepo;
	
	@RequestMapping(value="/vhcldtlsreg")
	public String VehicleRegDtls(Model model) {
		VehicleRegDtls vregdtls=new VehicleRegDtls();
		model.addAttribute("vhclreg",vregdtls );
		return "VehicleRegDtls";
		
	}

	@RequestMapping(value="/vhcldtlsreg" ,method=RequestMethod.POST)
	public String VhclRegDtls(@ModelAttribute("vhclreg")VehicleRegDtls vhclreg,Model model ) {
		VehicleRegDtlsEntity entity=new VehicleRegDtlsEntity();
		BeanUtils.copyProperties(vhclreg, entity);
		VehicleRegDtlsEntity savedEntity=vhclRegDtlsRepo.save(entity);
		model.addAttribute("vhclreg",savedEntity);
		return "redirect:/register";
		
	}
}
