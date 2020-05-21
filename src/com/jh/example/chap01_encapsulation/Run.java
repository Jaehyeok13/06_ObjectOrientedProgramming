package com.jh.example.chap01_encapsulation;

public class Run {

	public static void main(String[] args) {
		Account a = new Account();
		// 객체 : heap 영역에 공간이 생성 된 것
		// a.balance = -100;  
		// 캡술화 적용 하면서 외부에서 데이터 자체에 접근 불가 하게 만듬 private
		a.displayBalance();
		

		a.deposit(1000000); // 100만원 입금
		a.displayBalance();
		
		a.deposit(1500000); // 150만원 입금
		a.displayBalance();
		
		a.withdraw(500000); // 50만원 출금
		a.displayBalance();
		
//		a.balance = -1000000;
//		캡슐화가 적용되어 있는 상태에서는 외부에서 직접적인 접근 불가.
		
	}

}
