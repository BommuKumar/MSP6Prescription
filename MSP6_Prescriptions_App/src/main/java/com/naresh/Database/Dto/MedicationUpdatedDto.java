package com.naresh.Database.Dto;

public class MedicationUpdatedDto {
	

    private String medicationName;
	
	private String dosage;
	
	private String frequency;

	public String getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "MedicationUpdatedDto [medicationName=" + medicationName + ", dosage=" + dosage + ", frequency="
				+ frequency + "]";
	}

	public MedicationUpdatedDto(String medicationName, String dosage, String frequency) {
		super();
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.frequency = frequency;
	}

	public MedicationUpdatedDto() {
		super();
	}
	
	

}
