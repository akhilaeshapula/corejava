package com.training.day7;

public class Doctor {
	private String doctorName;
	private int doctorId;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, int doctorId) {
		super();
		this.doctorName = doctorName;
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + "]";
	}
	
}
