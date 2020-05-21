package com.jh.example.chap04_field.run;

import com.jh.example.chap04_field.controller.A_KindsOfVariable1;
import com.jh.example.chap04_field.controller.B_KindsOfVariable2;
import com.jh.example.chap04_field.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		A_KindsOfVariable1 ak = new A_KindsOfVariable1();
		ak.method1(5);
		ak.method2(); // method2 에는 전역 변수만 있기 때문에 따로 값을 입력 하지 않아도 된다.
		
		B_KindsOfVariable2 bk = new B_KindsOfVariable2();
		
		int a = B_KindsOfVariable2.staticNum;
		
		Product p = new Product();
		p.inform();
//		JVM 기본 값 초기화 : null, null, 0, 0이 출력됨.
//		명시적 초기화로 필드 초기화 : 초코파이, 오리온, 1500,100
		
//		인스턴스 초기화 블럭으로 초기화 : 칸쵸, 롯데, 1000, 90
		
		Product p1 = new Product();
		p1.inform();
//		인스턴스 초기화 블럭으로 초기화 : 칸쵸, 롯데, 1000, 80
		Product p2 = new Product();
		p2.inform();
//		인스턴스 초기화 블럭으로 초기화 : 칸쵸, 롯데, 1000, 70

//		클래스 초기화 블럭으로 초기화 : 칸쵸, 롯데, 1000, 139
//							   칸쵸, 롯데, 1000, 129
//							   칸쵸, 롯데, 1000, 119
		
//		static 초기화 블럭은 프로그램 시작 시에 초기화를 하기 때문에
//		객체 생성 이후, 인스턴스 블록의 값으로 덮어쓰게 됨.
		
		Product p3 = new Product("포카칩", "오리온", 3000, 30);
		p3.inform();
//		생성자를 통한 초기화 : 포카칩, 오리온, 3000, 30
		
//		JVM 기본 값 초기화 -> 명시적 초기화 -> 클래스 초기화(프로그램 시작 시 한 번만 초기화) 
//		-> 인스턴스 초기화(객체 생성 시 마다 초기화) -> 생성자를 통한 초기화

	}

}
