package fr.epita.datamodel;

import java.util.List;

public class Quiz {
	private int id;
	private String title;
	
	private List<Question> questions;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getId() {
		return this.id;
	}

}
