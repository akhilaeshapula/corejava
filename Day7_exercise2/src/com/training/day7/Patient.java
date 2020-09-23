package com.training.day7;

public class Patient {
	private String patientName;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientName) {
		super();
		this.patientName = patientName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + "]";
	}
	
}
