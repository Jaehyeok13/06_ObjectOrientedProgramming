package com.jh.example.chap01_encapsulation;

public class Account {
	private String name = "서재혁";
	private String phone = "010-9631-3445";
	private String pwd = "1q2w3e4r";
	private int bankcode = 3030;
	private int balance = 0;
	
	public Account() {}// 생성자 생성
		// 클래스 이름과 생성자 이름이 같은 것이 포인트
		// 객체를 생성하기 위한 일종의 메소드
	
	//입금을 위한 메소드
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		}else {
			System.out.println(" 잘못된 금액이 입력되었습니다.");
		}
	}
	
	// 출금을 위한 메소드
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에 " + money + "원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void displayBalance() {
		System.out.println(name + "님의 계좌에는 " + balance + "원이 있습니다.");
	}
	
}
