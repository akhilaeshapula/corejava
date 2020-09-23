package com.training.day7;
import java.util.*;
public interface Hospital {

	boolean addDoctor(Appointments appointment, Doctor doctor);
	boolean addPatient(Appointments appointment, Doctor doctor, Patient patient);
	List<Patient> cancelAppointment(Appointments appointments, Doctor doctor, Patient patient);
	List<Patient> returnPatientList(Appointments appointments, String docName);

}
