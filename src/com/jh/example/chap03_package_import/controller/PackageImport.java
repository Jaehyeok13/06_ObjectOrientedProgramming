package com.jh.example.chap03_package_import.controller;

public class PackageImport {
	public void importTest() {
//		Scanner sc = new Scanner();
		
	//	import 생략하는 방법 : 클래스의 풀네임을 써주기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
	//	import 없이 사용 가능한 package : java.lang
		Math.random();
		Integer.parseInt("1");
		Object o = new Object(); // Object는 모든 클래스의 조상 클래스 이다.
		
	//	같은 이름의 클래스 사용
//		Member m = new Member();
		
		int n = java.lang.reflect.Member.PUBLIC;
		
	}
}
