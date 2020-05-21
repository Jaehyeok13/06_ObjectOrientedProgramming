package com.jh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	public static int staticNum;
	// static 키워드는 전역 변수에서 사용 가능.
	// 클래스 변수라고도 한다.
	
	public static final int STATIC_NUM = 1;
	// static과 final 키워드를 함께 사용한 필드.
	// 상수 필드는 선언과 동시에 초기화가 반드시 되어야 한다.
	
//	public final static int STATIC_NUM2 ;
//	The blank final field STATIC_NUM2 may not have been initialized
//	초기화를 해주지 않아서 생기는 에러
	
	public final static int STATIC_NUM2 = 1;
	// final 과 static 의 순서는 바뀌어도 상관이 없다.
	
	public void method() { // non-static 메소드
//		static int localStaticNum;
//		Illegal modifier for parameter localStaticNum; only final is permitted
		
//		지역 변수에서는 static 키워드 사용 불가능
//		인스턴스 변수라고도 함.
//		non-static에서 메소드는 객체가 만들어져야 접근이 가능하기 때문에
//		static 키워드가 올 수 없음
		
	}
	
	public static void method2() {
//		static int localStaticNum;
		
//		static 메소드 내에서도 static 변수 사용 불가능
//		지역변수는 메소드가 호출 될 때 stack 영역에 생기기 때문에
//		메모리에 생성되는 위치가 다름.
	}
}
