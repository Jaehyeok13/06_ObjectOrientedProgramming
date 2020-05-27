package com.jh.example.chap06_method.run;

import com.jh.example.chap06_method.controller.A_NonSaticeMethod;
import com.jh.example.chap06_method.controller.B_StaticMethod;
import com.jh.example.chap06_method.vo.Trainee;

public class Run {

	public static void main(String[] args) {
		/*
		  	메소드(Method)
		  	수학의 함수와 비슷 하며 호출을 통해 사용
		  	전달 값이 없는 상태로 호출하거나 어떤 값을 전달하여 호출
		  	함수 내에 작성된 연산 수행 수행후 반환 값/ 결과 값은 있거나 없을 수 있다.
		  	
		  	표현식
		  	[접근제한자][예약어] 반환형 메소드명([매개변수]){
		  		// 기능 정의 
		  	}
		  	ex)
		  	
		  	public void information() {
				System.out.println();
			}
			
			메소드 예약어
			 static 				:	static 영역에 할당하여 객체 생성 없이 사용
			 final				:	종단의 의미, 상속 시 오버라이딩 불가능 변하지 않는 고정의 값 사용 할때 씀
			 abstact			:	미완성된, 상속하여 오버라이딩으로 완성시켜 사용해야함/ 내 입맛대로 변경 해서 쓴다. 즉 안에 내용이 정의 되어 있지 않음
			 synchronized	:	동기화 처리, 공유 자원에 한 개의 스레드만 접근 가능함
			 static final		:	static과 final 의 의미를 둘다 가짐
			 
			메소드 반환형
			void			:	반환형이 없음을 의미, 반환 값이 없을 경우 반드시 작성 해야 한다.
			기본자료형	:	연산 수행 후 반환 값이 기본 자료형일 경우 사용
			배열			:	연산 수행후 반환 값이 배열인 경우 배열의 주소값이 반환
			클래스		:	연산 수행후 반환 값이 해당 클래스 타입의 객체일 경우 해당 객체의 주소값이 반환(클래스 == 타입)
		  	
		 */
		A_NonSaticeMethod a = new A_NonSaticeMethod();
		a.method1();
		// 반환 값과 매개변수가 ㅇ벗는 메소드 호출의 경우
		// 불러온 메소드의 내용만 가져온다.
		// 단순 호출만 하여도 출력문을 통해서 콘솔창에 출력이 가능
		
		// 반환 값이 있고 매개 변수는 없는 메소드 호출의 경우
		String str = a.method2();
		System.out.println(a.method2());
		System.out.println(str);
		
		// 위처럼 반환 값을 있는 것은 가지고 언 값을 출력 하기위해서 위처럼 선언 해줘야 한다.
		
		// 반환 값이 없고 매개 변수는 있는 메소드 호출의 경우
		// 호출한 것을 인자 라고 많이 부른다.(매개 변수 라고 부를 수 있다.)
		
		a.method3(4, 5);
		//콘솔 창에 나타나는 것은 method3 에 출력문이 있기 때문이다.
		
		int result = a.method4(10, 32);
		System.out.println("restul : " + result);
		System.out.println("result : " + a.method4(10, 32));
// ========================================================
		
		// 반환 값과 매개 변수 값이 없는 메소드 호출의 경우
		B_StaticMethod b= new B_StaticMethod();
		b.staticMethod1();
		// static 메소드 호출 시에는 객체를 생성하지 않고 호출
		// 이미 프로그램 시작 시에 satic 영역에 메소드가 저장되어 있기 때문
		
		// 반환 값은 있고 매개 변수는 없는 메소드 호출
		System.out.println("10과 11의 합은 : " + B_StaticMethod.staticMethod2() + "입니다.");
	
		// 반환 값은 없고 매개 변수는 있는 메소드 호출
		B_StaticMethod.staticMethod3("서재혁");

		// 반환 값이 있고 매개 변수가 있는 메소드 호출
		System.out.println(B_StaticMethod.staticMethod4("헤이헤이"));
		
		Trainee t = new Trainee("서재혁", 'I', "오후", 95.4);
		System.out.println(t.inform());
		t.setClassRoom('H');
		System.out.println(t.inform());
	}

}
