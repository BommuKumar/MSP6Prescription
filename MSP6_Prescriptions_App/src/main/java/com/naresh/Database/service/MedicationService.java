package com.naresh.Database.service;

import java.util.List;

import com.naresh.Database.Dto.MedicationDto;
import com.naresh.Database.Dto.MedicationUpdatedDto;

public interface MedicationService {
	
	public List<MedicationDto>  getmedicationsDetails(int patientId);
	
	

	
	public String upadatedmedicationsDetails(int medicationID,MedicationUpdatedDto medicationUpdatedDto);

}
