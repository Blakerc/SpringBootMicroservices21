package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUd operations for specimens
 * 
 * 
 */

public interface iSpecimenService {
	
	/**
	 * get specimen from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching id
	 * 
	 */
	
	SpecimenDTO fetchBy(int id);
	
	/**
	 * persist the given DTO
	 * @param specimenDTO
	 */
	
	void save(SpecimenDTO specimenDTO);

};