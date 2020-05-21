package com.jh.example.chap02_class.defaultClass.controller;

// 접근 제한자를 default라고 명시하게 되면 에러 발생
// 접근제한자 작성을 하지 않는 것 자체가 default의 의미를 가짐

/* default*/ class DefaultClasstest {
	public void test() {
		System.out.print("default클래스 내의 test() 호출됨.");
	}
}
