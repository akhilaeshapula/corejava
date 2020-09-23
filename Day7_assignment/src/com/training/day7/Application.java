package com.training.day7;

import java.security.Provider.Service;
import java.util.*;

public class Application {
	
	public static void main(String[] args) {
		HashMap<Doctor, List<Patient>> map = new HashMap<Doctor, List<Patient>>();
	
		Appointments appointments = new Appointments(map);
		HospitalService service= new HospitalService();
		
		Doctor ram = new Doctor("Ram",1);
		Patient raj = new Patient("Raj");
		Patient rak = new Patient("Rakesh");
		service.addDoctor(appointments, ram);
		service.addPatient(appointments, ram, raj);
		service.addPatient(appointments, ram, rak);
		System.out.println("Patient List");
		List<Patient> patientList = service.returnPatientList(appointments, "Ram");
		Iterator<Patient> iterator = patientList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		service.cancelAppointment(appointments, ram, raj);
		System.out.println("Updated List");
		List<Patient> patientList1 = service.returnPatientList(appointments, "Ram");
		Iterator<Patient> iterator1 = patientList1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator1.next());
		}
		
	}

	
}
