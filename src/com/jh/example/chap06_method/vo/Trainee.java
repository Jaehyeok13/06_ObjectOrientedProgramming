package com.jh.example.chap06_method.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {
		
	}
	
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;
		// static 객체의 필드에 접근 하는 것이 아니기 때문에 this 사용 못함
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getACADEMY() {
		return ACADEMY;
	}
	
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	public char getClassRoom() {
		return classRoom;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}
	
	public static void setScore(double score) {
		Trainee.score = score;
		// static 같은 경우 클래스명. 으로 호출 해야 한다.
	}
	
	public double getScore() {
		return score;
	}
	
	public String inform() {
		return ACADEMY + " " + name + " 훈련생은 " + classRoom + " 반 " + time + " 이고" + score + " 점 입니다.";
	}
	
}
