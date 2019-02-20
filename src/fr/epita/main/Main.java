package fr.epita.main;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
import java.util.Scanner;

//import fr.epita.datamodel.Exam;
import fr.epita.datamodel.Quiz;
//import fr.epita.datamodel.Student;

import fr.epita.services.dao.QuizDAO;

public class Main {
	/**
	 * 
	 * The console interface to create a quiz
	 * @param scanner - the scanner object
	 */
	private static void createQuizInterface(Scanner scanner) {
		System.out.println("* Welcome to the Create a Quiz page *");
		System.out.println("Title of quiz:");
		String title = scanner.nextLine();
		Quiz quiz = new Quiz(title);
		QuizDAO quizDAO = new QuizDAO();
		quizDAO.create(quiz);
		
		System.out.println("Your title is : " + quiz.getTitle());
		System.out.println("Number of multiple choice questions (i.e. enter '5' or '10'):");
		int mcqLength = scanner.nextInt();
		int mcqNumber = 1;
		while (mcqNumber <= mcqLength) {
			System.out.println("Multiple Choice Question #" + mcqNumber + ".");
			System.out.println("Question title: ");
			String mcqTitle = scanner.nextLine();
			System.out.println("Answer 1 of 4: Please enter the correct answer:");
			String validAnswer = scanner.nextLine();
			int answerNum = 2;
			while (answerNum <= 4) {
				System.out.println("Answer " + answerNum + " of 4: Please enter the correct answer:");
				String answer = scanner.nextLine();	
				// logic to enter answer:
				answerNum++;
			}
			mcqNumber++;
		}
	}
	
	/**
	 * 
	 * The Quiz Manager console interface to take a quiz or perform CRUD on quizzes
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Quiz Manager!");
		System.out.println("Please enter '1' if you are a quiz manager or enter '2' if you are a student");
		int role = scanner.nextInt();
		switch (role) {
		case 1:
			System.out.println("**** Bonjour gestionnaire de quiz ****");
			System.out.println("To create a quiz enter '1', to update a quiz enter '2', to delete ad quiz enter '3', and to view a quiz enter '4");
			int quizCrud = scanner.nextInt();
			switch (quizCrud) {
			case 1:
				Main.createQuizInterface(scanner);
				break;
			case 2:
				System.out.println("* Welcome to the Update a Quiz Page *");
				
				break;
			case 3:
				System.out.println("* Welcome to the Delete a Quiz Page *");
				
				break;
			case 4:
				System.out.println("* Welcome to the View a Quiz Page *");
				
				break;
			default:
				// TODO: repeat loop
				System.out.println("* Wrong input. Please enter either '1' for quiz manager and '2' for student *");
			}
			break;
		case 2:
			System.out.println("**** Bonjour étudiant ****");
			
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

