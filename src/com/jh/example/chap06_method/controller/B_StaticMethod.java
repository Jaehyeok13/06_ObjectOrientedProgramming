package com.jh.example.chap06_method.controller;

public class B_StaticMethod {
	// static 메소드는 프로그램 실행 시 정적 메모리 공간(static 영역) 에 할당
	// 또한 프로그램 종료 시 정적 메모리 영역에서 삭제됨
	
	// 1.반환 값이 없고 매개변수도 없는 static 메소드
	public static void staticMethod1() {
		 int num1 = 10;
		 int num2 = 20;
		 
		 System.out.printf("%d + %d = %d \n", num1,num2,(num1+num2));
	}
	
	// 2.반환 값은 있고 매개 변수가 없는 static 메소드
	public static int staticMethod2() {
		int num1 = 10;
		int num2 = 11;
		return num1 + num2 ;
	}
	
	// 3.반환 값은 없고 매개 변수는 있는 static 메소드
	public static void staticMethod3(String name) {
		System.out.println(name+"님 환영 합니다.");
	}
	
	public static String staticMethod4(String name) {
		return name + "님, 환영 합니다.";
	}
}
