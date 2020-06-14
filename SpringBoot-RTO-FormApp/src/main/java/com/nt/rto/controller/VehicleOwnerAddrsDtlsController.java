package com.nt.rto.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.rto.entity.VehicleOwnerAddrsEntity;
import com.nt.rto.pojo.VehicleOwnerAddrsDetails;
import com.nt.rto.repository.VehicleOwnerAddrsDtlsRepository;

@Controller
public class VehicleOwnerAddrsDtlsController {
	
	@Autowired
	private VehicleOwnerAddrsDtlsRepository vhclAddrsdtlsRepo;

	@RequestMapping(value="/dtls")
	public String AddingAddrs(Model model) {
		VehicleOwnerAddrsDetails vownAddrs=new VehicleOwnerAddrsDetails();
		model.addAttribute("adddtls",vownAddrs);
		return "VehicleOwnerAddrs";
		
	}
	@RequestMapping(value="/dtls" ,method=RequestMethod.POST )
	public String AddingOwnerAddrs(@ModelAttribute("adddtls")VehicleOwnerAddrsDetails adddtls,Model model) {
		VehicleOwnerAddrsEntity entity=new VehicleOwnerAddrsEntity();
		BeanUtils.copyProperties(adddtls, entity);
		VehicleOwnerAddrsEntity savedEntity=vhclAddrsdtlsRepo.save(entity);
		model.addAttribute("adddtls", savedEntity);
		return "redirect:/vhcldtlsreg";
		
	}
}
