package com.naresh.Database.Dto;

import java.time.LocalDate;

public class DispensedResDto {
	
private int dispensationId;
	
	
	private int dispensedQuantity; 
	
	private LocalDate dispensationDate;
	
	private String dispensedBy;

	public int getDispensationId() {
		return dispensationId;
	}

	public void setDispensationId(int dispensationId) {
		this.dispensationId = dispensationId;
	}

	public int getDispensedQuantity() {
		return dispensedQuantity;
	}

	public void setDispensedQuantity(int dispensedQuantity) {
		this.dispensedQuantity = dispensedQuantity;
	}

	public LocalDate getDispensationDate() {
		return dispensationDate;
	}

	public void setDispensationDate(LocalDate dispensationDate) {
		this.dispensationDate = dispensationDate;
	}

	public String getDispensedBy() {
		return dispensedBy;
	}

	public void setDispensedBy(String dispensedBy) {
		this.dispensedBy = dispensedBy;
	}

	public DispensedResDto() {
		super();
	}

	@Override
	public String toString() {
		return "DispensedResDto [dispensationId=" + dispensationId + ", dispensedQuantity=" + dispensedQuantity
				+ ", dispensationDate=" + dispensationDate + ", dispensedBy=" + dispensedBy + "]";
	}

	public DispensedResDto(int dispensationId, int dispensedQuantity, LocalDate dispensationDate, String dispensedBy) {
		super();
		this.dispensationId = dispensationId;
		this.dispensedQuantity = dispensedQuantity;
		this.dispensationDate = dispensationDate;
		this.dispensedBy = dispensedBy;
	}
	
	

}
