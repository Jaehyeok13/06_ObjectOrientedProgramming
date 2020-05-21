package com.jh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	private static int num = 100;
// JVM 기본 값을 명시적 초기 값이 덮어 씀.
	
	{
		name = "칸쵸";
		price = 1000;
		brand = "롯데";
		num -=10;
		// 인스턴스 블록에서 static 필드 초기화 및 연산 가능
	}
	
	static {
		// 클래스 블록
//		name = "홈런볼";
//		brand = "해태";
//		price = 1000;
//		
//		static 블록에서는 non-static 필드 초기화 불가능.
		num = 150;
		num--;
	}
	
	public Product() {
	/*
		 기본 생성자 : 매개 변수 있는 생성자를 만들 때 반들시 만들어 줘야 한다. 초기 셋팅이다.
		 작성하지 않는 경우, 클래스 사용시 JVM이 자동으로 기본 생성자를 생성해주지만,
		 매개변수 생성자 작성 시 JVM이 기본 생성자를 자동으로 생성해주지 않음
		 상속에서 사용 시 반드시 기본 생성자를 작성해줘야 한다.
		 객체를 만들 때는 항상 만들어 주자.
		 
	*/
	}
	
	// 
	public Product(String mName,String mBrand, int mPrice, int mNum) {
		name = mName;
		brand = mBrand;
		price = mPrice;
		num = mNum;
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}
	
//	오버로딩 : 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성하는 기법.
//	오버로딩 조건 : 1) 같은 메소드 이름
//			  			  2) 매개변수의 개수 || 타입 || 순서가 달라야함.
	
	public void method1(int i) {
		// 기준
	}
	
	public void method1(String str) {
		// (오버로딩 적용됨) 기준과 매개변수 타입이 다름
	}
	
	public void method1(int i ,String str) {
		// (오버로딩 적용됨) 기준과 매개변수 개수 및 타입이 다름
	}
	
//	public void method1(String str) {
	// (오버로딩 적용안됨) 기본형과 개수 및 타입, 순서가 같음
//	}
	
//	public void method1(String iii) {
	// (오버로딩 적용안됨) 기본형과 개수 및 타입, 순서가 같음
//	}
	
	public void method1(int i, int k) {
//		(오버로딩 적용 됨) 기준과 매개변수 개수가 다름
	}

//	public void method1(int num, String string) {
//		(적용 안됨) 2번과 개수 및 타입이 같음
//	}

	public void method1(String str, int i) {
//		(오버로딩 적용 됨) 2번과 매개변수 개수 및 타입은 같지만 순서가 다름
	}
	
}
