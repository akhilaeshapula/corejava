package com.training.day7;


import java.util.*;


public class HospitalService implements Hospital {

	HashMap<Doctor,List<Patient>> dataSheet ;
	
	
	@Override
	public boolean addPatient(Appointments appointment,Doctor doctor, Patient patient) {
		dataSheet = appointment.getAppointmentList() ;

		if(dataSheet.containsKey(doctor) && dataSheet.get(doctor) != null) {
			List<Patient> patients = dataSheet.get(doctor);
			patients.add(patient);
			dataSheet.put(doctor, patients);
		}
		else {
			List<Patient> patients = new ArrayList<Patient>();
			patients.add(patient);
			dataSheet.put(doctor,patients);
		}
		return false;
	}

	@Override
	public boolean addDoctor(Appointments appointments, Doctor doctor) {
		dataSheet=appointments.getAppointmentList();
		dataSheet.put(doctor, null);
		return false;
	}

	@Override
	public List<Patient> returnPatientList(Appointments appointments, String docName) {
		// TODO Auto-generated method stub

		dataSheet = appointments.getAppointmentList();
		Set<Map.Entry<Doctor, List<Patient>>> list= dataSheet.entrySet();
		for(Map.Entry<Doctor, List<Patient>> eachEntry: list) {
			Doctor doctor = eachEntry.getKey();
			if(doctor.getDoctorName().equalsIgnoreCase(docName)) {
				return eachEntry.getValue();
			}
		}
		return null;
	}
		
	@Override
	public List<Patient> cancelAppointment(Appointments appointments, Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub

		dataSheet = appointments.getAppointmentList();

		List<Patient> patients = dataSheet.get(doctor);

		patients.remove(patient);

		return patients;
	}


	
}
