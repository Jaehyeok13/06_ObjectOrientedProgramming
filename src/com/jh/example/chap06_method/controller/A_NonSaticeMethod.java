package com.jh.example.chap06_method.controller;

public class A_NonSaticeMethod {
	// 매개변수 유무와 반환 유무에 따른 구분
	
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		// 반환 값 없음 매개변수도 없음
		// 메소드 내용만 수행 후 아무 값도 반환하지 않고 (리턴 값 없음)
		// 호출 한 메소드로 돌아감
		
		// 즉 호출하면 여기서 실행만 한다. 근데 왜 하는 거지?? 의문이 들어야지
		System.out.println("매개변수와 반환 값 둘다 없는 메소드 입니다.");
//		return;
		// 모든 메소드에 생략되어 있음(JVM 자동생성)
		// 그래서 모든 수행이 끝나면 나를 호출한 메소드로 돌아 가는 것
		
	}
	
	// 2. 반환 값(리턴 값)은 있고 매개 변수가 없는 메소드
	public String method2() {
		// This method must return a result of type String 반드시 String 의 return 값을 입력 해야한다.
		
		// 반환 값 존재 매개변수 없음
		// 반환 값이 있다는 것은 return 과 반환 타입이 없기 때문에 꼭 선언 해줘야 한다.
		// return 값을 가지고 호출한 메소드에 가지고 간다.
		// String st = "매개 변수는 없고 반환 값은 있는 메소드 입니다.";
		
		return "매개 변수는 없고 반환 값은 있는 메소드 입니다.";
	}
	
	// 3.반환 값은 없고 매개 변수는 있는 메소드
	public void method3(int num1, int num2) {
		// 반환 값 X				매개변수 2개 존재
		// 호출한 곳에서 괄호에 인자로 넘긴 값을 받기 위해 선언 하는 것이 매개 변수 ( 호출한 매개변수가 () 의 변수에 들어감
		// 메소드 선언 시 괄호 안에 변수를 선언해서 메소드 내에서 사용 = 지역변수
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	//4. 반환 값 있고 매개 변수도 있는 메소드
	public int method4(int num1 , int num2) {
		//int result = num1 + num2;
		int result;
		return result = num1 + num2;
	}
}
