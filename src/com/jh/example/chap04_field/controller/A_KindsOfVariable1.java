package com.jh.example.chap04_field.controller;

public class A_KindsOfVariable1 {
	private int globalNum; // 필드

	// 클래스 영역에 작성하는 변수 = 필드
	// 멤버 변수 : 클래스가 가지는 멤버라는 의미
	// 전역 변수 : 클래스가 전역에서 사용할 수 있는 변수라는 의미
	
	public void method1(int num) {
		// 지역변수 : 메소드 영역에서 작성한 변수
		// 매개변수 : 메소드 선언부 중에서 괄호 안에 선언하는 변수
		// 매개 변수도 지역 변수중 하나이다. 즉 변수하나를 받아서 선언된 변수로 들어 간다.
		
		int localNum;
//		 System.out.println(localNum); 
//		The local variable localNum may not have been initialized
//		지역 변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어 있어야 함.
//		즉 int localNum = 0; 이렇게 초기화 해줘야 한다. 	
		 
		 
		System.out.println(num);
//		매개 변수는 호출 시 값이 있는 상태로 넘어오기 때문에 별다른 초기화 없이도 사용 가능
		
		System.out.println(globalNum);
// 	전역 변수는 클래스 전역에서 사용 가능하기 때문에 초기화 하지 않아도 출력에 문제 없다.
		
		
	} // <- 메소드 영역 끝
	
	public void method2() {
		System.out.println(globalNum);
//		System.out.println(localNum);
	}
	
	
} // <- 클래스 영역 끝
