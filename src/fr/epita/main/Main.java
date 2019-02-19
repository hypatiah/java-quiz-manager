package fr.epita.main;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

//import fr.epita.datamodel.Exam;
//import fr.epita.datamodel.Quiz;
//import fr.epita.datamodel.Student;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Quiz Manager!");
		System.out.println("If you are a quiz manager, input 1. If you are a student, input 2");
		int role = scanner.nextInt();
		switch (role) {
		case 1:
			System.out.println("You are a quiz manager");
			break;
		case 2:
			System.out.println("You are a student");
			break;
		default:
			System.out.println("Wrong input. Please enter eithe '1' for quiz manager and '2' for student");
		}

//		Doctor doctor = new Doctor("John Smith", 42);      // instantiation of doctor
//		Patient patient = new Patient("Bobby Rickman", 28);  // instantiation of patient
//		Nurse nurse = new Nurse("Marlene Simmons", 38);    // instantiation of nurse
//		Appointment appointment = new Appointment(doctor, patient, new Date(), AppointmentType.OPERATION);
//		// instantiation of appointment with doctor, patient, date and appointment type as parameters
//		List<Nurse> nursesInvolved = new ArrayList<Nurse>();
//		nursesInvolved.add(nurse); // put the nurse in a list
//		
//		appointment.setNursesInvolved(nursesInvolved); // add list of nurses to appointment
//		
//		System.out.println("Appointment set for " + appointment.getAppointmentDate());
//		System.out.println("Doctor of the appointment : " + doctor.getName());
//		System.out.println("Patient concerned : " + patient.getName());
//		for (Nurse nurseInvolved : appointment.getNursesInvolved()) { // for each nurse involved in the operation
//			System.out.println("Nurse involved : " + nurseInvolved.getName());
//		}
	}
}

