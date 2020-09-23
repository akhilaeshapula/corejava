package com.training.day7;

import java.util.HashMap;
import java.util.List;

public class Appointments {
	private  HashMap <Doctor,List<Patient>> appointmentList;

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(HashMap<Doctor, List<Patient>> appointmentList) {
		super();
		this.appointmentList = appointmentList;
	}

	public HashMap<Doctor, List<Patient>> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(HashMap<Doctor, List<Patient>> appointmentList) {
		this.appointmentList = appointmentList;
	}
	

}
