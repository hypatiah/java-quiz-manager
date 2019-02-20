package fr.epita.main;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
import java.util.Scanner;

//import fr.epita.datamodel.Exam;
import fr.epita.datamodel.Quiz;
import fr.epita.datamodel.Question;
//import fr.epita.datamodel.Student;

import fr.epita.services.dao.QuizDAO;

public class Main {
	
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
			System.out.println("**** Bonjour Quiz Manager ****");
			System.out.println("To create a quiz enter '1', to update a quiz enter '2' and to delete a quiz enter '3'");
			int crudAction = scanner.nextInt();
			while (crudAction != 1 || crudAction != 2 || crudAction != 3) {
				System.out.println("Input error. Please enter '1' to create '2' to update or '3' to delete a quiz.");
				crudAction = scanner.nextInt();
			}
			switch (crudAction) {
			case 1:
				Main.createQuizInterface(scanner);
				break;
			case 2:
				Main.updateQuizInterface(scanner);
				break;
			case 3:
				Main.deleteQuizInterface(scanner);
				break;
			default:
				System.out.println("Error");
			}
			break;
		case 2:
			System.out.println("**** Bonjour Student ****");
			
			break;
		default:
			System.out.println("Wrong input. Please enter either '1' for quiz manager and '2' for student");
		}
	}
	
	/**
	 * 
	 * The console interface to create a quiz
	 * @param scanner - the scanner object
	 */
	private static void createQuizInterface(Scanner scanner) {
		System.out.println("* Welcome to the Create a Quiz page *");
		System.out.println("Title of quiz:");
		String title = scanner.nextLine();
		Quiz quiz = new Quiz(title); // instantiation of quiz
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
	 * The console interface to update a quiz
	 * @param scanner - the scanner object
	 */
	private static void updateQuizInterface(Scanner scanner) {
		System.out.println("* Welcome to the Update a Quiz page *");
	}
	
	/**
	 * 
	 * The console interface to delete a quiz
	 * @param scanner - the scanner object
	 */
	private static void deleteQuizInterface(Scanner scanner) {
		System.out.println("* Welcome to the Delete a Quiz page *");
	}
}

