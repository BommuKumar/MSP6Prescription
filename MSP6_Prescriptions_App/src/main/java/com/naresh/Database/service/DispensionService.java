package com.naresh.Database.service;

import java.util.List;

import com.naresh.Database.Dto.DispensationDto;
import com.naresh.Database.Dto.DispensedResDto;
import com.naresh.Database.Entity.Dispensation;

public interface DispensionService {
	
	public String dispenceMedicine(DispensationDto dispensationdto);
	
	
  public   List<DispensedResDto>getAllDespentions(int patientId);

}
