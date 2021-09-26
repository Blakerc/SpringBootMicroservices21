package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;


@Component
public class SpecimenServiceStub implements iSpecimenService {
	public SpecimenDTO fetchBy(int id) {
		
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLattitude("40.75");
		specimenDTO.setLongitude("70.4");
		specimenDTO.setDescription("A beautiful eastern redbud");
		return specimenDTO;
	}
	
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
