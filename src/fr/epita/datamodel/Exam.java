package fr.epita.datamodel;

import java.util.List;

public class Exam {
	
	private List<Answer> answers;
	
	private List<MCQAnswer> MCQAnswers;
	
	private long grade;

	private Student student;
	
	private Quiz quiz;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<MCQAnswer> getMCQAnswers() {
		return MCQAnswers;
	}

	public void setMCQAnswers(List<MCQAnswer> MCQAnswers) {
		this.MCQAnswers = MCQAnswers;
	}

	public long getGrade() {
		return grade;
	}

	public void setGrade(long grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	
}