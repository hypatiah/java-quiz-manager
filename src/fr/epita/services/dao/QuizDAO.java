package fr.epita.services.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.epita.datamodel.Quiz;

public class QuizDAO {
	private static final String DB_PASSWORD = "";
	private static final String DB_USERNAME = "sa";
	private static final String DB_URI = "jdbc:h2:~/java-quiz-managerjdbc;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE";
	
	public void create(Quiz quiz) {
		try {
			Connection connection = DriverManager.getConnection(DB_URI, DB_USERNAME, DB_PASSWORD);
			PreparedStatement statement = connection.prepareStatement("INSERT INTO QUIZZES VALUES ?");
//			PreparedStatement statement = connection.prepareStatement("INSERT INTO QUIZZES VALUES (?, ?)");
			statement.setString(0, quiz.getTitle());
//			statement.setInt(1, quiz.getDifficulty());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}
	
	public Quiz read(String title) {
		
	}
	
	public void update(Quiz quiz) {
		
	}
	
	public void delete(Quiz quiz) {
		
	}
}
