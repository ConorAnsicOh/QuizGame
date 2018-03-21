package com.ktds.conor.quiz.vo;

public class QuizVO {

	public int id;
	public String title;
	public String body;
	public String answer;
	public int level;

	public int writeDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(int writeDate) {
		this.writeDate = writeDate;
	}

}
