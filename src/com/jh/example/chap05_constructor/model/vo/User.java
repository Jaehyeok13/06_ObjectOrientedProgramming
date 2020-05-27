package com.jh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	/*
	 * 	생성자
	 * 	객체가 new 연산자를 통해 Heap메모리 영역에 할당될 떄
	 * 	객체 안에서 만들어지는 필드 초기화
	 * 	생성자는 일종의 메소드로, 전달된 초기 값을 받아서 객체의 필드에 기록
	 
	 		규칙
	 			생성자의 선언은 메소드 선언과 유사하나 반환 값이 없으며
	 			생성자명을 클래스명과 똑같이 지정해주어야 함
	 */
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	// 생성자 사용 목적
	
	// 1. 객체를 생성해주기 위해서
	//	2. 매개변수로 전달받은 값으로 필드 초기화 하기 위해서
	
	// 생성자 사용 시 주의사항.
	// 리턴형(반환형) 이 존재하지 않음 (void, char, int.. 등)
	
	// 생성자 종류
	// 1. 기본 생성자
	// - 아무 매개변수가 없는 생성자
	// - JVM이 기본적으로 생성해줌
	// - 매개변수 있는 생성자를 만들었을 경우 기본 생성자는 자동 생성되지 않기 때문에 반드시 명시
	
	public User() {
		// 만약 넣읗 데이터가 있다면 넣어도 된다.
		// 현재는 넣을 데이터가 없어서 그냥 선언만 해줌
	}
	
	// 2. 매개변수 있는 생성자
	// - 객체 생성과 필드를 초기화하는 두 가지 목적으로 사용
	// - 기본 생성자와 오버로딩 되어있는 상태   
	// ★ 오버로딩 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성하는 기법
	//	조건 1.같은 메소드 이름
	// 조건 2.다른 매개변수의 개수 또는 다른 매개변수 타입
	
	public User(String userId, String userPwd, String userName) {
		// 굳이 필드에 있는 모든 데이터를 넣을 필요 없음. 내가 초기화 해줄것만 해주면 된다.
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// this.생성자
		// 인스턴스 메소드에 숨겨진 채 존재하는 래퍼런스 변수
		// 할당 된 객체 자신을 의미한다. (this.전역변수)
		// 매개변수 명이 필드명과 같은 경우 매개변수의 변수명이 우선이므로 this 객체를 이용하여 대입도니느 변수가
		// 필드라는것을 구분 해줌.
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);
//		중복되는 초기화 내용이 존재할 경우 this() 사용 가능
//		this() 생성자는 가장 첫 줄에 선언해야 함. (두 번째 줄로 넘어가면 오류)
		this.enrollDate = enrollDate;
	}
	
	public void inform() {
		System.out.println(userId +"," + userPwd + "," + userName + "," + enrollDate);
	}
	
}
