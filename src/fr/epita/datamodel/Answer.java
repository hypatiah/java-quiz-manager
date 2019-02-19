package fr.epita.datamodel;

public class Answer {
	
	private Exam exam;
	
	private Question question;
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Student getExam() {
		return exam;
	}

	/**
	   *
	   * Set the exam
	   *
	*/
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
